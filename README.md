
Overview
---------

The Employee Management System is a Spring Boot application designed to manage employee records in a company. The application supports essential operations 
such as creating, reading, updating, and deleting (CRUD) employee details. It utilizes a MySQL database to store and manage the employee data.


Features
---------

Create Employee: Add a new employee to the system by providing their name, email, and phone number.
Read Employees: Retrieve the list of all employees in the system.
Update Employee: Modify the details of an existing employee.
Delete Employee: Remove an employee from the system.
RESTful API: The system exposes a RESTful API for all operations, making it easy to integrate with other systems or front-end applications.

===================================================================================================================


Technologies Used
-------------------

Java 17: The core programming language used in the project.
Spring Boot: A framework that simplifies the development of Java applications by providing a comprehensive infrastructure for building enterprise-grade applications.
Spring Data JPA: A part of the Spring Data family, used to simplify data access and persistence in the application.
MySQL: The relational database used to store employee data.
Maven: A build automation tool used to manage dependencies and build the project.
Lombok: A library that reduces boilerplate code by generating getter, setter, and other utility methods at compile-time.

=================================================================================================================


Database Schema
-----------------

The application uses a single table named employee_db to store employee details. The table structure is as follows:

Column Name	Data Type	Description
id	Long	Auto-generated unique identifier.
name	String	Name of the employee.
email	String	Email address of the employee.
phone	String	Phone number of the employee.


========================================================================================================


Getting Started
-----------------


Prerequisites
---------------

Java 17 or higher

MySQL 5.7 or higher

Maven 3.6 or higher



Installation
-------------

1. Clone the Repository:
  git clone https://github.com/GoutamPahwa/EmployeeManagement
  cd employee-management

2. Set Up MySQL Database:
  Create a new database named employee.
  Update the application.properties file with your MySQL credentials.

3. Build the Project:
  mvn clean install

4. Run the Application:
  mvn spring-boot:run

5. Access the API:
  The application will run on http://localhost:8080.
  Use tools like Postman or cURL to interact with the API endpoints.

======================================================================================================


API Endpoints
--------------

GET "/employees" : Retrieve all employees.
POST "/employees" : Create a new employee.
DELETE "/employees/{id}" : Delete an employee by ID.

========================================================================================================


Example Request
----------------

Create Employee:

POST "/employees"

Content-Type: application/json

{
    "name": "Raj",
    "email": "raj10@example.com",
    "phone": "1234567890"
}


======================================================================================================


Contributing
-------------

Contributions are welcome! Please feel free to submit a Pull Request.

