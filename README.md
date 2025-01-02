Leucine Company Hackathon Project: Employee Management System 🏢💼
Welcome to the Employee Management System project, developed during the hackathon at Leucine company. This project focuses on creating a robust web application for managing employee leaves, with distinct roles for admin, employee, and manager. The application is built using Thymeleaf for the frontend and JSP, Servlet, and MySQL for the backend.

Key Features 🔑
1. Admin Login 🛡️
The admin has the highest level of access and can manage the entire application. Key functionalities include:

User Management: Adding, updating, or removing employee and manager accounts.
Leave Management: Viewing all leave requests, approving or rejecting them, and managing leave types.
Dashboard: An overview of all activities within the application, including pending leave requests and user activities.
2. Employee Login 👥
Employees have access to functionalities that allow them to:

Submit Leave Requests: Apply for leaves, specifying the type of leave (e.g., sick leave, casual leave) and the duration.
View Leave Status: Check the status of their leave requests (pending, approved, rejected).
Profile Management: Update their personal information and view their leave history.
3. Manager Approve or Reject 🕵️‍♂️
Managers have the authority to:

Approve/Reject Leave Requests: Review leave requests from employees in their department and either approve or reject them.
Departmental Oversight: View and manage leave requests specific to their department.
Profile Management: Update their personal information and view their leave history.
Technology Stack 💻
Frontend: Thymeleaf 🌐
Thymeleaf: Used for rendering dynamic content on web pages. It integrates seamlessly with Spring Boot to provide a robust templating engine.
HTML, CSS, JavaScript: Used alongside Thymeleaf to create responsive and interactive user interfaces.
Backend: JSP, Servlet, MySQL 🗄️
JSP (JavaServer Pages): Used for creating dynamic web pages that can display data from the server.
Servlets: Handle the business logic and process requests from the client. They act as controllers, managing the flow of data between the user interface and the database.
MySQL: The relational database management system used to store user data, leave requests, and other relevant information.
JDBC (Java Database Connectivity): Facilitates the connection between the Java application and the MySQL database, allowing for CRUD operations.
Example Workflow 🔄
Employee Submits a Leave Request:

The employee logs in and navigates to the leave request form.
The form is submitted, and the data is sent to a servlet.
The servlet processes the request and stores the leave details in the MySQL database.
Manager Reviews the Request:

The manager logs in and views pending leave requests from their department.
The manager can approve or reject the request, updating the status in the database.
Admin Oversight:

The admin can log in to view all leave requests, manage user accounts, and ensure the smooth operation of the application.
Security and Authentication 🔒
Login and Logout: Implemented using servlets and JSP, ensuring secure authentication for different user roles.
Session Management: Maintains user sessions to keep track of logged-in users and their activities.
Conclusion 🏁
This project demonstrates a comprehensive leave management system with clear role-based access control, leveraging modern web technologies for both the frontend and backend. It ensures efficient management of leave requests and user accounts within an organization.
