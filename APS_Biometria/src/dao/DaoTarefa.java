package dao;

import java.util.List;
import model.Tarefa;
import org.hibernate.Query;
import org.hibernate.Session;


public class DaoTarefa extends DaoGenerico{
    
    
    Session session;

    public DaoTarefa() {
            
    }
    
    
    public List <Tarefa> listar() {
        session = hibernateConfiguracao.openSession();
        List<Tarefa> tarefas;
        try {
            Query consulta = session.createQuery("Tarefa.listar");
            tarefas = consulta.list();
        } catch (RuntimeException ex) {
            throw ex;

        } finally {
            session.close();
        }
        return tarefas;
    }
    
}
