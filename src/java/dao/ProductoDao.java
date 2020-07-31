
package dao;

import java.util.List;
import model.Producto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitarios.HibernateUtil;

public class ProductoDao {
    
    //RegistrarMatricula
    public void registrarProducto(Producto producto) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        /*Metod transaction*/
        Transaction transaction = session.beginTransaction();
        session.save(producto);
        transaction.commit();
        session.close();

    }

    public List<Producto> listarProducto() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Producto";
        Query query = session.createQuery(hql);
        List<Producto> miLista = query.list();
        return miLista;
    }
}
