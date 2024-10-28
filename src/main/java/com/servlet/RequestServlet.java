package com.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;


import com.db.DatabaseConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String softwareId = request.getParameter("softwareId");
        String accessType = request.getParameter("accessType");
        String reason = request.getParameter("reason");

        try (Connection conn = DatabaseConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO requests (user_id, software_id, access_type, reason, status) " +
                "VALUES ((SELECT id FROM users WHERE username = ?), ?, ?, ?, 'Pending')");
            ps.setString(1, username);
            ps.setString(2, softwareId);
            ps.setString(3, accessType);
            ps.setString(4, reason);
            ps.executeUpdate();
            response.sendRedirect("requestAccess.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
