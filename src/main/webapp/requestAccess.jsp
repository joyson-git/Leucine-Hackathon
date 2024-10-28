<%@page import="com.db.DatabaseConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, jakarta.servlet.http.*, jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Access</title>
</head>
<body>
    <h2>Request Access to Software</h2>
    <form action="RequestServlet" method="post">
        <label>Software Name:</label>
        <select name="softwareId" required>
            <% 
                try {
                    Connection conn = DatabaseConnection.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT id, name FROM software");
                    while(rs.next()) {
            %>
                        <option value="<%= rs.getInt("id") %>"><%= rs.getString("name") %></option>
            <%
                    }
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </select><br><br>
        <label>Access Type:</label>
        <select name="accessType" required>
            <option value="Read">Read</option>
            <option value="Write">Write</option>
            <option value="Admin">Admin</option>
        </select><br><br>
        <label>Reason for Request:</label>
        <textarea name="reason" required></textarea><br><br>
        <button type="submit">Submit Request</button>
    </form>
</body>
</html>
