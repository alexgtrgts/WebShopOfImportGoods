package Servlets;

import AlekseevProject.DAOProductImpl;
import AlekseevProject.DAOSupplierImpl;
import pojos.Supplier;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.SQLException;

@WebServlet(value = "/deleteProduct")
public class DeleteProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp,Serializable id) throws ServletException, IOException {
        DAOProductImpl dpi = new DAOProductImpl();
        PrintWriter pw = resp.getWriter();
        String param = req.getParameter("id");
        try {
            dpi.delete(Integer.parseInt(param));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ServletContext context = getServletContext();
        RequestDispatcher rd = context.getRequestDispatcher("listAll.jsp");
        rd.forward(req,resp);
    }
}
