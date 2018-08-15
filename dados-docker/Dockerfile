FROM jboss/wildfly:latest

USER jboss
RUN /opt/jboss/wildfly/bin/add-user.sh localdev P@$$w0rd --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]