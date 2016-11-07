/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoServico;
import java.util.List;
import model.Servico;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterServico {
    
    DaoServico context;
    
    public CtrManterServico()
    {
        context = new DaoServico();
    }
    
    public int gravarServico (Servico servico)
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
    
    public List carregarServicos()
    {
        try
        {
            return context.carregarTudoOrdenado(Servico.class, "tx_nome");
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarServico(Servico servico)
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
}
