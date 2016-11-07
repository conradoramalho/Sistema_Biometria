/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoCliente;
import java.util.List;
import model.Cliente;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterCliente {
    
    DaoCliente context;
    
    public CtrManterCliente()
    {
        context = new DaoCliente();
    }
    
    public int gravarCliente (Cliente cliente)
    {
        try
        {
            context.gravar(cliente);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarClientes()
    {
        try
        {
            return context.carregarTudoOrdenado(Cliente.class, "tx_nome");
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarCliente(Cliente cliente)
    {
        try
        {
            context.alterar(cliente);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public int excluirCliente (Cliente cliente)
    {
        try
        {
            context.excluir(cliente);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
}
