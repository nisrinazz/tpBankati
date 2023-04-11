package ma.bankati.web.controlleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HC" , urlPatterns = {"/hello","*.php"} , loadOnStartup = 1)
public class HelloControlleur extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from HelloControlleur</h1>");
        out.println("Server name :"+ request.getServerName());
        out.println("Protocol :"+ request.getProtocol());
        out.println("Port :"+ request.getServerPort());
        out.println("Method :"+ request.getMethod());
    }


}
