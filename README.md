# cinema-app

This project is a simulation of a simple cinema 
service that supports registration, 
authentication, and CRUD operations. 
It utilizes various Design Patterns, follows
SOLID principles, and adheres to the REST 
structure of a WEB application.

### Features:

- Register or login as a user
- Create, find, and add movies to movie sessions
- Create and find available movie sessions
- Create a shopping cart
- Complete an order
- Create and find movie sessions
- Create and add cinema halls to movie sessions
- Create and add tickets to the shopping cart

### Technologies:

- Java Core - 17 version
- Spring Context - 5.3.20 version
- Spring ORM - 5.3.20 version
- Spring WEB MVC - 5.3.20 version
- Spring Security - 5.6.10 version
- Hibernate - 5.6.14 version
- MySQL - 8.0.22 version
- Jackson Databind - 2.14.1 version

### DB Schema Structure:
![pic](readme.pictures/Schema_Cinema.png)

### Launch instruction:

1. Set up Database connectivity:
   ![pic](readme.pictures/Properties_Setup.png)![img.png](readme.pictures/Add_Configuration.png)
2. Configure Tomcat:
- Open "Run" -> "Edit Configurations..."
   ![pic](readme.pictures/Edit_Configurations.png)
- Add a new configuration
   ![pic](readme.pictures/Add_Configuration.png)
- Select local Tomcat Server
  ![pic](readme.pictures/Select_Local_Tomcat.png)
- Setup deployment configurations
  ![pic](readme.pictures/Setup_Deployment_Configurations.png)
- Run Tomcat, and you're ready to go! An admin user with login:
"admin@i.ua" and password: "admin123" is already provided for 
authentication and authorization.
  ![pic](readme.pictures/Login.png)

### Endpoint description (with roles and http-methods)
- DELETE: /movie-sessions/{id} - (admin)
- GET: /cinema-halls - (user/admin)
- GET: /movies - (user/admin)
- GET: /movie-sessions/available - (user/admin)
- GET: /orders - (user)
- GET: /shopping-carts/by-user - (user)
- GET: /users/by-email - (admin)
- POST: /register - (all)
- POST: /cinema-halls - (admin)
- POST: /movies - (admin)
- POST: /movie-sessions - (admin)
- POST: /orders/complete - (user)
- PUT: /movie-sessions/{id} - (admin)
- PUT: /shopping-carts/movie-sessions - (user)


