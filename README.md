# Gerenciador de Super Heróis em uma API Reativa com Spring Boot

Desenvolvimento de uma API de gerenciamento de super heróis utilizando Spring WebFlux, junto com a biblioteca reativa Reactor.


# O que foi utilizado?

- Java 8;
- Maven;
- IntelliJ;
- Spring WebFlux;
- Reactor;
- AWS CLI;
- AmazonDynamoDB;
- JUnit;
- Swagger UI;
- Postman.

## Comandos úteis

**Configurar o AWS**
$aws configure

**Inicializar o DynamoDB**
$java -Djava.library.path =. / DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb

**Verificar tabelas criadas no no DynamoDB pelo terminal**
$aws dynamodb list-tables - endpoint-url [http: // localhost: 8000](http://localhost:8000/)

**Acessar link no Swagger**
$[http: // localhost: 8080 / swagger-ui-heroes-reactive-api.html](http://localhost:8080/swagger-ui-heroes-reactive-api.html)
