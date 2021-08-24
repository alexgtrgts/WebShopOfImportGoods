package Servlets;

import AlekseevProject.DAOProductImpl;
import SessionUtil.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@WebServlet(value = "/listAll")
public class ListAllProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOProductImpl dpi = new DAOProductImpl();
        try {
            List<Product> product = dpi.getAllProducts();
            ServletContext context = getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/ListAllProducts.jsp");
            req.setAttribute("product",product);
            rd.forward(req,resp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
