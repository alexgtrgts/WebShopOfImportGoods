package SessionUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

    private SessionFactory sessionFactory=null;

    public SessionUtil() {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public void stopSessionFactory() {
        sessionFactory.close();
    }




}
