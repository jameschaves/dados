
 
Superintendência Nacional de Previdência Complementar
Coordenação-Geral de Tecnologia da Informação
Webservice de consulta a dados - Data

Autores: Filipe Paschoal Góes

Instalação do sistema no Wildfly 10:

1) Adicionar as seguintes datasources.
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

2) Adicionar usuários ao wildfly, utilizando o script add-user, da pasta bin, com o papel "usuario".

NOTA: Se quiser rodar os testes de integração (classes com final IT), adicionar o usuário de login "data", senha P@$$w0rd, papel usuario ao wildfly de desenvolvimento. Ou então, editar a classe manualmente.
