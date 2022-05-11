# Gerenciador de Tarefas

<span id="badges"></span>
![Badge em Desenvolvimento](http://img.shields.io/static/v1?&label=STATUS&message=EM%20DESENVOLVIMENTO&color=yellow&?style=flat-square)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=BACKEND&message=JAVA%2011&color=important&style=flat-square)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=FRAMEWORK&message=SPRING%20BOOT%204&color=success&style=flat-square)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=FRONTEND&message=ANGULAR%2011&color=red&style=flat-square)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=DATABASE&message=POSTGRESQL&color=informational&style=flat-square)
</br>
</br>
Esse projeto tem como funcionalidade principal o cadastro, leitura, atualização e remoção de tarefas delegadas à, nesse caso, desenvolvedores. O sistema foi desenvolvido em linguagem Java 11 e o framework Spring Boot para back-end e Angular para front-end. O deploy da aplicação foi feita no Heroku com Banco de Dados PostgreSQL local.

## Itens Requisitados:
a)	Criar uma aplicação Front-end utilizando Angular na versão mais recente. ✅
  - Front-end (Funcionalidades) : https://github.com/GabrielDantas-99/crud-interface
  - Front-end (API) : https://drive.google.com/drive/folders/1OuaNfbjMOxw3oes7YnTrYiCy0hBZ5K9R?usp=sharing

b)	Desenvolver o backend utilizando Java 11 e Spring Boot. ✅
  - https://github.com/GabrielDantas-99/AtividadePratica

c)	Os endpoints devem ser em REST. ✅

Itens opcionais, mas que se feitos mostram um diferencial:

d)	A aplicação deverá ter um controle de login por usuário e senha e os endpoints devem autenticar através de token JWT.
  - Configurada no arquivo src/main/resources/application-dev.properties para futura implementação

e)	Utilizar persistência em um banco de dados PostgreSQL e persistência JPA. ✅

f)	Utilizar testes de unidades.  ✅

g)	Documentar a API usando o Swagger (https://swagger.io).  ✅
  - Springfox Swagger

h)	Publicar projeto no heroku ou outro ambiente cloud.  ✅
  - https://atividade-crud-esig.herokuapp.com
 

## Modelo de Domínio: <span id="modelo-de-dominio"></span>
<div align="center">
  <img width = "400rem" height="300em" src="https://github.com/GabrielDantas-99/AtividadePratica/blob/main/imgs/ModeloDeDominio.png?raw=true"/>
</div>

## Desenvolvimento:
Para o desenvolvimento do projeto, foi necessário instalar os seguintes programas:
  - <a href="https://www.azul.com/downloads/?package=jdk">JDK 11</a>: Necessário para executar o projeto Java
  - <a href="https://spring.io/tools">Spring Tool Suite 4</a>: Ambiente de desenvolvimento com plugins Spring Boot
  - <a href="https://www.postman.com/downloads/">Postman</a>: Ferramenta para consultas na API REST
  - <a href="https://www.postgresql.org/download/">PostgreSQL</a>: Ferramenta para consultas na API REST PostgreSQL
  - <a href="https://www.postman.com/downloads/">NodeJS</a> + npm install -g @angular/cli

