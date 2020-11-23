# Installation

* `mvn install`
* `mvn verify`
* Make sure you have install PostgreSql on your device PC/LAPTOP/SERVER.
* Configure your db here `./src/main/resources/application.properties`

application.properties : 

`spring.datasource.url=jdbc:postgresql://localhost:8001/postgres_db`

`spring.datasource.username=postgres`

`spring.datasource.password=Password09!`

`spring.datasource.driver-class-name=org.postgresql.Driver`

`spring.jpa.show-sql=true`

`spring.jpa.hibernate.ddl-auto=update`

`spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect`

`server.port=8000`

###### _## ROUTES: ##_
##### CUSTOMERS
`GET ALL : http://localhost:8000/customers` { Method GET }

`GET ID : http://localhost:8000/customers/{id}` { Method GET }

`POST : http://localhost:8000/createUpdateCustomers` { Method POST } // for update, just put id in the body of json

`{ "email": "mail@example.com", "fullname": "Your name here" }`

`DELETE : http://localhost:8000/doDeleteCustomers/{id}` { Method DELETE }


##### CATEGORY
`GET ALL : http://localhost:8000/category` { Method GET }

`GET ID : http://localhost:8000/category/{id}` { Method GET }

`POST : http://localhost:8000/createUpdateCategory` { Method POST } // for update, just put id in the body of json

`{ "description": "test description", "name": "Example Category" }` 

`DELETE : http://localhost:8000/doDeleteCategory/{id}` { Method DELETE } 


##### PRODUCTS (INCLUDE RELATION)
`GET ALL : http://localhost:8000/products` { Method GET }

`GET ID : http://localhost:8000/products/{id}` { Method GET }

`POST : http://localhost:8000/createUpdateProducts` { Method POST } // for update, just put id in the body of json

`{ "categoryId": {"id": 23}, "createdBy": {"id": 15}, "name": "Example Product" }` 

`DELETE : http://localhost:8000/doDeleteProducts/{id}` { Method DELETE } 


# Run Spring REST API
##### _Windows_
`mvnw spring-boot:run`

##### _MacOS/Linux_
`./mvnw spring-boot:run`
