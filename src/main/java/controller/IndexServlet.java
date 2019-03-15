package controller;

import model.Comment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class IndexServlet extends javax.servlet.http.HttpServlet {

    private List<Comment> commentList = new ArrayList<>();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       String title = request.getParameter("title");
        String content = request.getParameter("content");
        commentList.add(new Comment(title,content));
        response.sendRedirect("/unsafe-webapp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("comments", commentList);
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
