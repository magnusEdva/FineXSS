package controller;

import dao.CommentDAO;
import model.Comment;

import javax.ejb.EJB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class IndexServlet extends javax.servlet.http.HttpServlet {


    @EJB
    CommentDAO commentDAO;


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       String title = request.getParameter("title");
        String content = request.getParameter("content");
        commentDAO.add(new Comment(title,content));
        System.out.println("lol??s");
        System.out.println("lol??s");
        response.sendRedirect("");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("comments", commentDAO.getComments());
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
