package AlekseevProject;

import org.hibernate.mapping.List;
import org.hibernate.mapping.Set;

import java.io.Serializable;
import java.sql.SQLException;

public interface DAO <T> {

    public void create (T t) throws SQLException, ClassNotFoundException;
    public T read (T t, Serializable id) throws SQLException, ClassNotFoundException;
    public T update (T t) throws SQLException, ClassNotFoundException;
    public void delete (Serializable id) throws SQLException, ClassNotFoundException;

}
