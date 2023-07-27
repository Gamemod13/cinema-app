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

- Spring Context
- Spring ORM
- Spring WEB MVC
- Spring Security
- Hibernate
- MySQL
- Jackson Databind
- Java Core

### Project Structure:
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


