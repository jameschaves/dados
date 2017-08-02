Superintendência Nacional de Previdência Complementar
Coordenação-Geral de Tecnologia da Informação
Webservice de consulta a dados corporativos - Corp

Autor(es): Filipe Paschoal Góes

1. Uso

https://<hostname>:<porta>/corp/rest/corp/efpcs?cnpj=<numero_do_cnpj>
https://<hostname>:<porta>/corp/rest/corp/pessoasjuridicasspc?cnpj=<numero_do_cnpj>
https://<hostname>:<porta>/corp/rest/corp/planosbeneficios?cnpb=<numero_do_cnpb>

A autenticação é BASIC, ou seja, deve-se por em cada requisição um header de nome "Authorization", tendo como valor a string <usuario>:<senha> codificada em base64. Tais usuários e senhas devem ser adicionados ao Wildfly spor meio do script $WILDLY_HOME/bin/add-user.sh, com o papel "usuario".

2. Instalação do sistema no Wildfly 10.
2.1. Adicionar o driver sqljdbc.
2.2. Adicionar as seguintes datasources, mudando o que for necessário.
	<subsystem xmlns="urn:jboss:domain:datasources:4.0">
        <datasources>
			...
			<datasource jndi-name="java:jboss/datasources/CorpDSDev" pool-name="CorpDSDev" enabled="true" use-ccm="true">
				<connection-url>jdbc:sqlserver://10.68.20.138;instanceName=SQL01;databaseName=CORP</connection-url>
				<driver>sqljdbc4.0-4.jar</driver>
				<pool>
					<min-pool-size>10</min-pool-size>
					<max-pool-size>20</max-pool-size>
					<prefill>true</prefill>
				</pool>
				<security>
					<user-name>localdev</user-name>
					<password>P@$$w0rd</password>
				</security>
			</datasource>
			<datasource jndi-name="java:jboss/datasources/CorpDSProd" pool-name="CorpDSProd" enabled="true" use-ccm="true">
				<connection-url>jdbc:sqlserver://10.68.20.138;instanceName=SQL01;databaseName=CORP</connection-url>
				<driver>sqljdbc4.0-4.jar</driver>
				<pool>
					<min-pool-size>10</min-pool-size>
					<max-pool-size>20</max-pool-size>
					<prefill>true</prefill>
				</pool>
				<security>
					<user-name>localdev</user-name>
					<password>P@$$w0rd</password>
				</security>
			</datasource>
			...
		</datasources>
	</subsystem>

2.3. Adicionar usuários ao wildfly, utilizando o script $WILDLY_HOME/bin/add-user.sh, com o papel "usuario".

NOTA: Se quiser rodar os testes de integração (classes com final IT), adicionar o usuário de login "corp", senha P@$$w0rd, papel usuario ao wildfly de desenvolvimento. 

2.4. Ativar o https no wildfly. Não utilizar o sistema sem o protocolo https, para não comprometer a segurança.