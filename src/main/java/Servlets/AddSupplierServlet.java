package Servlets;

import AlekseevProject.DAOSupplierImpl;
import lombok.SneakyThrows;
import org.hibernate.Session;
import pojos.Supplier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet(value = "/AddSupplier")
public class AddSupplierServlet extends HttpServlet {

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOSupplierImpl dsi = new DAOSupplierImpl();
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String brandname = req.getParameter("brandname");
        Supplier sup = new Supplier(name,address,brandname);
        dsi.create(sup);
        pw.println("You have successfully added a supplier!");
        resp.setContentType("text/html");
        pw.println("<html><body>");
        pw.println("<br>");
        pw.println("<a href=\"index.jsp\">Go back</a>");
        pw.println("<br>");
        pw.println("</body></html>");
    }
}
