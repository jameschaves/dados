# Use latest jboss/base-jdk:11 image as the base
FROM jboss/base-jdk:11

# Set the WILDFLY_VERSION env variable
ENV WILDFLY_VERSION 15.0.0.Final
ENV WILDFLY_SHA1 a387f2ebf1b902fc09d9526d28b47027bc9efed9

#ENV WILDFLY_VERSION 10.0.0.Final
#ENV WILDFLY_SHA1 c0dd7552c5207b0d116a9c25eb94d10b4f375549

ENV JBOSS_HOME /opt/jboss/wildfly
ENV DB_DRIVER_NAME sqljdbc4-4.0.jar

USER root

RUN yum update -y
RUN yum install wget -y

# Add the WildFly distribution to /opt, and make wildfly the owner of the extracted tar content
# Make sure the distribution is available from a well-known place
RUN cd $HOME \
    && curl -O https://download.jboss.org/wildfly/$WILDFLY_VERSION/wildfly-$WILDFLY_VERSION.tar.gz \
    && sha1sum wildfly-$WILDFLY_VERSION.tar.gz | grep $WILDFLY_SHA1 \
    && tar xf wildfly-$WILDFLY_VERSION.tar.gz \
    && mv $HOME/wildfly-$WILDFLY_VERSION $JBOSS_HOME \
    && rm -f wildfly-$WILDFLY_VERSION.tar.gz \
    && chown -R jboss:0 ${JBOSS_HOME} \
    && chmod -R g+rw ${JBOSS_HOME}

# Ensure signals are forwarded to the JVM process correctly for graceful shutdown
ENV LAUNCH_JBOSS_IN_BACKGROUND true

# Expose the ports we're interested in
EXPOSE 8443

# Set the default command to run on boot
# This will boot WildFly in the standalone mode and bind to all interface


WORKDIR /usr/local/src
RUN /opt/jboss/wildfly/bin/add-user.sh -a #{USUARIOADMIN}# #{SENHAADMIN}# --silent
RUN echo #{USUARIOADMIN}#=usuario >> /opt/jboss/wildfly/standalone/configuration/application-roles.properties

RUN wget http://clojars.org/repo/com/microsoft/sqlserver/sqljdbc4/4.0/sqljdbc4-4.0.jar
RUN mv sqljdbc4-4.0.jar /opt/jboss/wildfly/standalone/deployments/

ADD ./customization /opt/jboss/wildfly/customization/
#RUN chown -R jboss:root /opt/jboss/wildfly/customization/
RUN chown -R jboss:root /opt/jboss/
RUN chmod +x /opt/jboss/wildfly/customization/execute.sh

USER jboss

RUN /opt/jboss/wildfly/customization/execute.sh

ADD ./target/dados.war /opt/jboss/wildfly/standalone/deployments
ADD ./customization/application.keystore /opt/jboss/wildfly/standalone/configuration

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0","-bmanagement", "0.0.0.0"]
