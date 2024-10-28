<%@page import="com.db.DatabaseConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, jakarta.servlet.http.*, jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pending Requests</title>
</head>
<body>
    <h2>Pending Access Requests</h2>
    <form action="ApprovalServlet" method="post">
        <table border="1">
            <tr>
                <th>Employee Name</th>
                <th>Software Name</th>
                <th>Access Type</th>
                <th>Reason</th>
                <th>Action</th>
            </tr>
            <%
                try {
                    Connection conn = DatabaseConnection.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(
                        "SELECT requests.id, users.username, software.name, requests.access_type, requests.reason " +
                        "FROM requests JOIN users ON requests.user_id = users.id " +
                        "JOIN software ON requests.software_id = software.id " +
                        "WHERE requests.status = 'Pending'");
                    
                    while (rs.next()) {
            %>
                        <tr>
                            <td><%= rs.getString("username") %></td>
                            <td><%= rs.getString("name") %></td>
                            <td><%= rs.getString("access_type") %></td>
                            <td><%= rs.getString("reason") %></td>
                            <td>
                                <button type="submit" name="action" value="approve-<%= rs.getInt("id") %>">Approve</button>
                                <button type="submit" name="action" value="reject-<%= rs.getInt("id") %>">Reject</button>
                            </td>
                        </tr>
            <%
                    }
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </form>
</body>
</html>
