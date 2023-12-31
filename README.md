## Coding Project - Heroes (Backend)

**Changes made:**

- **Pagination**

  Enabled the page-based pagination, which using the "pageNo" parameter to specify the desired page number, "pageSize" parameter to specify the number of elements shown per page, "sortBy" and "sortDir" parameters to determine how to sort the elements. The user can call the API with or without specify those parameters, if not specified, the API responds with the corresponding contents based on the default values of parameters:

  pageNo = "0", pageSize = "10", sortBy = "id", sortDir ="asc"

- **Exception Handler**

  Added the `GlobalExceptionHandler` classes for more specific and accurate error/exception handling with the error details provided.

- **Spring Security**

  Added the in-memory authentication in the `SecurityConfiguration` class and defined two roles: 'ADMIN' and 'USER'. Only the successfully logged in user with the role of 'ADMIN' can access to the get method. 

  Username: admin; Password: admin

   Username: user; Password: user

- **Logging**

  Used the Spring AOP for the logging which separated the logging from our business logic.

- **API Documentation**

  Implemented Swagger to describe and document RESTful APIs.

  http://localhost:8080/swagger-ui/