/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoTarefa;
import java.util.List;
import model.Tarefa;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterTarefa {
    
    DaoTarefa context;
    
    public CtrManterTarefa()
    {
        context = new DaoTarefa();
    }
    
    public int gravarTarefa (Tarefa servico)
    {
        try
        {
            context.gravar(servico);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarTarefas()
    {
        try
        {
            return context.carregarTudoOrdenado(Tarefa.class, "id_tarefa");
            //return context.listar();
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarTarefa(Tarefa servico)
    {
        try
        {
            context.alterar(servico);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public int excluirTarefa (Tarefa servico)
    {
        try
        {
            context.excluir(servico);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    
}
