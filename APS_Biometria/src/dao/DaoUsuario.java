package dao;

import java.util.ArrayList;
import model.Usuario;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


public class DaoUsuario extends DaoGenerico{
    
    Session session;
    
    public Object carregarUsuario(String tx_login, Class clas) throws HibernateException {
        
        session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(clas);
        criteria.add(Restrictions.eq("tx_login", tx_login));
        Object obj = criteria.uniqueResult();
        transaction.commit();
        session.close();
        return obj;
    
    }
    
    
    public Object carregarSenha(String tx_senha, Class clas) throws HibernateException {
        
        session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(clas);
        criteria.add(Restrictions.eq("tx_senha", tx_senha));
        Object obj = criteria.uniqueResult();
        transaction.commit();
        session.close();
        return obj;
    
    }
    
    public Object carregarCPF(String tx_cpf, Class clas) throws HibernateException {
        
        session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(clas);
        criteria.add(Restrictions.eq("tx_cpf", tx_cpf));
        Object obj = criteria.uniqueResult();
        transaction.commit();
        session.close();
        return obj;
    
    }
    
    
    public void salvar(Usuario usuario) {
    	Session session = hibernateConfiguracao.getSession();
    	session.saveOrUpdate(usuario);
    	//session.getTransaction().commit();
    }


    /**
     * Retorna todos os registros de alunos do banco
     * @return
     */
	@SuppressWarnings("unchecked")
	public ArrayList<Usuario> getTodos(){		
		return (ArrayList<Usuario>) hibernateConfiguracao.getSession().createCriteria(Usuario.class).addOrder(Order.asc("id_usuario")).list();       
    }
}
