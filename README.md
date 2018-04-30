```
﻿DDDDDDDDDDDDD                  AAA               DDDDDDDDDDDDD             OOOOOOOOO        SSSSSSSSSSSSSSS
D::::::::::::DDD              A:::A              D::::::::::::DDD        OO:::::::::OO    SS:::::::::::::::S
D:::::::::::::::DD           A:::::A             D:::::::::::::::DD    OO:::::::::::::OO S:::::SSSSSS::::::S
DDD:::::DDDDD:::::D         A:::::::A            DDD:::::DDDDD:::::D  O:::::::OOO:::::::OS:::::S     SSSSSSS
  D:::::D    D:::::D       A:::::::::A             D:::::D    D:::::D O::::::O   O::::::OS:::::S            
  D:::::D     D:::::D     A:::::A:::::A            D:::::D     D:::::DO:::::O     O:::::OS:::::S            
  D:::::D     D:::::D    A:::::A A:::::A           D:::::D     D:::::DO:::::O     O:::::O S::::SSSS         
  D:::::D     D:::::D   A:::::A   A:::::A          D:::::D     D:::::DO:::::O     O:::::O  SS::::::SSSSS    
  D:::::D     D:::::D  A:::::A     A:::::A         D:::::D     D:::::DO:::::O     O:::::O    SSS::::::::SS  
  D:::::D     D:::::D A:::::AAAAAAAAA:::::A        D:::::D     D:::::DO:::::O     O:::::O       SSSSSS::::S
  D:::::D     D:::::DA:::::::::::::::::::::A       D:::::D     D:::::DO:::::O     O:::::O            S:::::S
  D:::::D    D:::::DA:::::AAAAAAAAAAAAA:::::A      D:::::D    D:::::D O::::::O   O::::::O            S:::::S
DDD:::::DDDDD:::::DA:::::A             A:::::A   DDD:::::DDDDD:::::D  O:::::::OOO:::::::OSSSSSSS     S:::::S
D:::::::::::::::DDA:::::A               A:::::A  D:::::::::::::::DD    OO:::::::::::::OO S::::::SSSSSS:::::S
D::::::::::::DDD A:::::A                 A:::::A D::::::::::::DDD        OO:::::::::OO   S:::::::::::::::SS
DDDDDDDDDDDDD   AAAAAAA                   AAAAAAADDDDDDDDDDDDD             OOOOOOOOO      SSSSSSSSSSSSSSS
```
Superintendência Nacional de Previdência Complementar
Coordenação-Geral de Tecnologia da Informação
Webservice de consulta a dados avulsos

Autor(es): Filipe Paschoal Góes

# 1. Uso
```
https://<hostname>:<porta>/dados/rest/dados/efpcs/{matricula}
https://<hostname>:<porta>/dados/rest/dados/efpcs/idpjspc/{id}
https://<hostname>:<porta>/dados/rest/dados/pessoasjuridicasspc/{id}
https://<hostname>:<porta>/dados/rest/dados/pessoasjuridicasspc/cnpj/{cnpj}
https://<hostname>:<porta>/dados/rest/dados/planosbeneficios/{id}
https://<hostname>:<porta>/dados/rest/dados/planosbeneficios/cnpb/{cnpb}
```
A autenticação é BASIC, ou seja, deve-se por em cada requisição um header de nome "Authorization", tendo como valor a string <usuario>:<senha> codificada em base64. Tais usuários e senhas devem ser adicionados ao Wildfly spor meio do script $WILDLY_HOME/bin/add-user.sh, com o papel "usuario".

# 2. Instalação do sistema no Wildfly 10.
2.1. Adicionar o driver jdbc do Sql Server.

2.2. Adicionar a seguinte datasource, mudando o que for necessário.
```
	<subsystem xmlns="urn:jboss:domain:datasources:4.0">
        <datasources>
			...
			<datasource jndi-name="java:jboss/datasources/DadosDS" pool-name="DadosDS" enabled="true" use-ccm="true">
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
```
2.3. Adicionar usuários ao wildfly, utilizando o script $WILDLY_HOME/bin/add-user.sh, com o papel "usuario".

NOTA: Se quiser rodar os testes de integração (classes com final IT), adicionar o usuário de login "dados", senha P@$$w0rd, papel usuario ao wildfly de desenvolvimento.

2.4. Ativar o https no wildfly. Não utilizar o sistema sem o protocolo https, para não comprometer a segurança.
