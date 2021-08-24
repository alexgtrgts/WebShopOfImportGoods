package AlekseevProject;

import SessionUtil.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Product;

import javax.management.Query;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class DAOProductImpl implements DAO<Product>{

    @Override
    public void create(Product product) throws SQLException, ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.saveOrUpdate(product);
        transaction.commit();
        //session.close();
    }

    @Override
    public Product read(Serializable id) throws SQLException, ClassNotFoundException {
        Product prod = null;
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        prod = (Product) session.get(Product.class,id);
        transaction.commit();
        return prod;
    }

    public List<Product> getAllProducts() throws SQLException,ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.beginTransaction();
        String query = "select p from Product p";
        List <Product> productList = (List) session.createQuery(query).list();
        session.getTransaction().commit();
        return productList;
    }

    @Override
    public Product update(Product product) throws SQLException, ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.saveOrUpdate(product);
        transaction.commit();
        return product;
    }

    @Override
    public void delete(Serializable id) throws SQLException, ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        Product product = (Product) session.get(Product.class,id);
        transaction.begin();
        session.delete(product);
        transaction.commit();
        session.close();
    }
}
