# Employee Management System (EMS with Spring ORM & JPA)

# Overview:
The Employee Management System is designed to efficiently handle the management of employee information within an organization using Spring ORM with Jakarta Persistence API (JPA). This system allows for the seamless storage, retrieval, and modification of employee details, including their name, ID, and salary.<br>

# Key Features:

## 1. Employee CRUD Operations-
The system facilitates basic CRUD (Create, Read, Update, Delete) operations for employee records. Users can easily add new employees, view their details, update information, and remove employees as needed.<br>

## 2. Spring ORM and JPA Integration with MySQL Database-
The project leverages the Spring Framework's Object-Relational Mapping (ORM) capabilities in conjunction with the Jakarta Persistence API (JPA) to interact with a MySQL database. This ensures a standardized and efficient way to map Java objects to relational database tables, simplifying the data access layer of the application.<br>

## 3. Employee Information Storage-
Each employee record consists of essential details, including:<br>

Name: The full name of the employee.<br>
ID: A unique identifier for each employee.<br>
Salary: The monetary compensation associated with the employee.<br>

# Technologies Used:
The Employee Management System utilizes the following technologies:<br>

Java: The primary programming language for the application.<br>
Spring Framework: Providing comprehensive support for building enterprise applications.<br>
Jakarta Persistence API (JPA): Enabling seamless interaction with the database.<br>
MySQL Database: Serving as the relational database management system for storing employee data.<br>

# Setup and Configuration:
To run the Employee Management System locally, follow these steps:<br>

Dependencies: Ensure that Java, Spring, and any required libraries are installed.<br>
Database Configuration: Set up the connection details to your MySQL database in the application properties file, specifying Spring JPA properties.<br>
Database Schema: Create the necessary database tables as per the provided SQL schema.<br>

# Usage:
## Adding a New Employee-
To add a new employee:<br>

Access the system interface.<br>
Navigate to the employee creation section.<br>
Input the employee's name, ID, and salary.<br>
Save the record.<br>

## Retrieving Employee Information-
To retrieve employee information:<br>

Use the search or list functionality to find the desired employee by ID.<br>
Access the employee details page to view the information.<br>

## Updating Employee Details-
To update employee details:<br>

Locate the employee record to be modified by ID.<br>
Access the edit functionality.<br>
Update the necessary fields.<br>
Save the changes.<br>

## Deleting an Employee-
To delete an employee:<br>

Find the employee record to be removed by ID.<br>
Access the delete functionality.<br>
Confirm the deletion.<br>
