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

@WebServlet("/ApprovalServlet")
public class ApprovalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String[] parts = action.split("-");
        String decision = parts[0];
        int requestId = Integer.parseInt(parts[1]);

        String newStatus = decision.equals("approve") ? "Approved" : "Rejected";

        try (Connection conn = DatabaseConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("UPDATE requests SET status = ? WHERE id = ?");
            ps.setString(1, newStatus);
            ps.setInt(2, requestId);
            ps.executeUpdate();
            response.sendRedirect("pendingRequests.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
