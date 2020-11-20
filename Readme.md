# Installation

* `mvn install`
* `mvn verify`

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


# Run Spring REST API
##### _Windows_
`mvnw spring-boot:run`

##### _MacOS/Linux_
`./mvnw spring-boot:run`
