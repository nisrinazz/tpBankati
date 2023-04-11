package ma.bankati.web.controlleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/home")
public class HomeControlleur extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // request.getRequestDispatcher("/hello").forward(request,response);
       // response.sendRedirect("http://www.google.com");
        response.sendRedirect(getServletContext().getContextPath() + "/hello");
    }
}
