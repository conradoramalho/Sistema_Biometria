/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Bruno
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario extends Pessoa {

    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id_usuario;
    private String tx_login;
    private String tx_senha;
    private Boolean fl_ativo;
    private byte[] digital;

    public Usuario() {

        super.tx_cpf = "";

    }

    public String getTx_cpf() {
        return super.tx_cpf;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @return the tx_login
     */
    public String getTx_login() {
        return tx_login;
    }

    /**
     * @param tx_login the tx_login to set
     */
    public void setTx_login(String tx_login) {
        this.tx_login = tx_login;
    }

    /**
     * @return the tx_senha
     */
    public String getTx_senha() {
        return tx_senha;
    }

    /**
     * @param tx_senha the tx_senha to set
     */
    public void setTx_senha(String tx_senha) {
        this.tx_senha = tx_senha;
    }

    /**
     * @return the fl_ativo
     */
    public Boolean getFl_ativo() {
        return fl_ativo;
    }

    /**
     * @param fl_ativo the fl_ativo to set
     */
    public void setFl_ativo(Boolean fl_ativo) {
        this.fl_ativo = fl_ativo;
    }

    public int toInt() {

        return this.getId_usuario();

    }

    @Override
    public String toString() {
        return String.valueOf(getId_usuario());
    }

    public DPFPTemplate getDigital() {
        return DPFPGlobal.getTemplateFactory().createTemplate(this.digital);
    }

    public void setDigital(DPFPTemplate digital) {
        this.digital = digital.serialize();
    }


    public void setId_usuario(Object id_usuario) {
        String id = String.valueOf(id_usuario);
        this.id_usuario = Integer.valueOf(id);
    }
}
