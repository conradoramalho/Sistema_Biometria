/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoAnimal;
import java.util.List;
import model.Animal;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterAnimal {
    
    DaoAnimal context;
    
    public CtrManterAnimal()
    {
        context = new DaoAnimal();
    }
    
    public int gravarAnimal (Animal animal)
    {
        try
        {
            context.gravar(animal);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarAnimais()
    {
        try
        {
            return context.carregarTudoOrdenado(Animal.class, "tx_nome");
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarAnimal(Animal animal)
    {
        try
        {
            context.alterar(animal);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public int excluirAnimal (Animal animal)
    {
        try
        {
            context.excluir(animal);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    
}
