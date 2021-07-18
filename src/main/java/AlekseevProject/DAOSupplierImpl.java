package AlekseevProject;

import SessionUtil.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Product;
import pojos.Supplier;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Set;

public class DAOSupplierImpl implements DAOSupplier {

    @Override
    public void create(Supplier supplier) throws SQLException, ClassNotFoundException {
         SessionUtil su = new SessionUtil();
         Session session = su.getSession();
         Transaction transaction = session.getTransaction();
         transaction.begin();
         session.saveOrUpdate(supplier);
         transaction.commit();
         //session.close();
    }

    @Override
    public Supplier read(Supplier supplier, Serializable id) throws SQLException, ClassNotFoundException {
        Supplier supl = null;
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        supl = (Supplier) session.get(Supplier.class,id);
        transaction.commit();
        return supl;
    }

    @Override
    public Supplier update(Supplier supplier) throws SQLException, ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.saveOrUpdate(supplier);
        transaction.commit();
        return supplier;
    }

    @Override
    public void delete(Serializable id) throws SQLException, ClassNotFoundException {
        SessionUtil su = new SessionUtil();
        Session session = su.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Supplier supplier = (Supplier) session.get(Supplier.class,id);
        session.delete(supplier);
        transaction.commit();
    }
}
