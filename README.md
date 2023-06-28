# PW2-Projeto_Final
IFRS | Cadeira PWII | Projeto Final - comunicação autenticada entre microsserviços 


## Apresentação
https://youtu.be/-QcE3XQevDI

OBS: detalhes sobre problemas do Keycloack no final da apresentação



## Trabalho usando as tecnologias:
  - Quarkus = Para desenvolvimento de microsserviços
  - Keycloack = Para autenticar a comunicação



## Fontes:
Quarkus
  https://quarkus.io/
  
Keycloack
  https://www.keycloak.org/



## DEPENDêNCIAS DOS SERVIÇOS
serviço acesso_sistema
	Porta: 8080
	Dependências: OpenID Connect, 
	
serviço sistema
	Porta: 8081
	Dependências: Hibernate ORM with Panache, Mysql JDBC Driver
	


## KEYCLOACK

MANUAL DE INICIO KEYCLOACK
https://www.keycloak.org/getting-started/getting-started-docker

KEYCLOACK POR DOCKER
docker run -p 8099:8080 -e KEYCLOAK_ADMIN=dyego_admin -e KEYCLOAK_ADMIN_PASSWORD=admin -v KEYCLOACK_PW2:/opt/keycloak/data/ quay.io/keycloak/keycloak:21.0.2 start-dev

- VERSÃO DO KEYCLOACK: keycloak:21.0.2  (MESMA DA DEPENDENCIA DO QUARKUS)
- RODA O DOCKER NA PORTA: 8099
- USA VOLUME NOMEADO PARA PERSISTENCIA DOS DADOS SEMPRE QUE FECHAR O KEYCLOACK NOME DO VOLUME: KEYCLOACK_PW2
- USUARIOS DO KEYCLOACK: 
	LOGIN: dyego_user
	PASSWORD: 1234
	User comun para autenticacao

	LOGIN: dyego_admin
	PASSWORD: admin
	User de admin do Keycloack

- ARQUIVO DE CONFIGURAÇÃO DO REALM:
	quarkus-realm.json
	
	Disponível para download no link: https://github.com/quarkusio/quarkus-quickstarts/blob/main/security-keycloak-authorization-quickstart/config/quarkus-realm.json

- CASO SEJA USADO O KEYCLOACK QUE INICIA COMO DEPENDENCIA DO QUARKUS, O ARQUIVO DO REALM QUE VAI SER USADO ESTA NA PASTA "config"´ DO SERVIÇO



TUTORIAL GUIA PARA TESTAR AUTENTICAÇÃO
https://quarkus.io/guides/security-oidc-bearer-token-authentication-tutorial



# OUTRAS DICAS
https://www.youtube.com/watch?v=APyD_ytXin0&list=PLK8jPaPePW_a_iXZVLU4-jb3U4vu4_4KU&index=9

LINKS 
KEYCLOACK
https://www.youtube.com/watch?v=jik377ND_iU
https://www.youtube.com/watch?v=Pqg88fR3nfU


Criando uma API Rest do zero com Java + Quarkus - Parte 1
https://www.youtube.com/watch?v=HgmvGOwA4ck

Criando API Rest com Java + Quarkus - Parte 2
https://www.youtube.com/watch?v=wWtleILrPnE



https://www.youtube.com/watch?v=0RMYomgf4a8


https://cloud.google.com/architecture/identity/keycloak-single-sign-on?hl=pt-br


Keycloak Custom Login Page
https://www.youtube.com/watch?v=uy0EbRFqltY


Iniciando Keycloak e autenticação entre microsserviços
https://www.youtube.com/watch?v=rgcHXpxxaZ0&t=455s

Autenticando microsserviços com Keycloak
https://www.youtube.com/watch?v=82GIvH0qkJ4