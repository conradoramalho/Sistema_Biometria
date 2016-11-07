/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoUsuario;
import java.security.NoSuchAlgorithmException;
import model.Usuario;
import model.Util;
import org.hibernate.HibernateException;

/**
 *
 * @author jefferson
 */
public class CtrBuscarUsuario {

    DaoUsuario acessohibernateuser;
    private Usuario user;
    
    
    public CtrBuscarUsuario() 
    {
       acessohibernateuser = new DaoUsuario();
        
    }    
    
    public int logar() throws NoSuchAlgorithmException{
    
        
        
        try 
        
        {
            
              Usuario usuBanco = buscarUsuario();
        //System.out.println(String.valueOf(txtSenha.getPassword()));
            if (usuBanco == null){
            //nao existe login
            return 1;
            }
            
            if( !usuBanco.getTx_senha().equals(user.getTx_senha()))
            {
                //sennha
                return 2; 
                
            }
                  
            return 0;
        }
      
        catch (Exception e) {
           
            
            return 3;
        }
    
    
    
    }
    
    
    
    public Usuario buscarUsuario(){
    
        try {
            return (Usuario) acessohibernateuser.carregarUsuario(user.getTx_login(),Usuario.class);
       //return usuario;

        }
        catch(HibernateException e){
        
        return null;
    }
   
    }
    
    public Usuario buscarSenha() throws NoSuchAlgorithmException{
    
        String senha = Util.aplicarHash(user.getTx_senha());
        try {
        return (Usuario) acessohibernateuser.carregarSenha(senha,Usuario.class);
        

        }
        catch(HibernateException e){
        
        return null;
    }
   
    }
    
    

    /**
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

   
    
  
    
    
}
