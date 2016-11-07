/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.levymoreira.biometria.Biometria;
import dao.DaoUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Usuario;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterUsuario {
    
    DaoUsuario context;
    Usuario user;
    
    public CtrManterUsuario()
    {
        context = new DaoUsuario();
        user = new Usuario();

    }
    
    public int gravarUsuario (Usuario usuario)
    {
        try
        {
            context.gravar(usuario);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarUsuarios()
    {
        try
        {
            return context.carregarTudoOrdenado(Usuario.class, "tx_nome");
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarUsuario(Usuario usuario)
    {
        try
        {
            context.alterar(usuario);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }   
    
    public boolean searchCPF(String cpf) {
        
        Usuario usuario = (Usuario) context.carregarCPF(cpf, Usuario.class);
        
        if (usuario != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public ArrayList todosUsuario(ArrayList usuarios){
        
        context.getTodos();
        return usuarios;
    }
}
