/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Bruno
 */


@MappedSuperclass
public abstract class Pessoa implements Serializable {
    
    protected String tx_nome;
    protected String tx_cpf;
    protected String tx_rg;
    protected String tx_endereco;
    protected String tx_cidade;
    protected String tx_bairro;
    protected String tx_numero;
    protected String tx_cep;
    protected String tx_estado;
    @Temporal(TemporalType.DATE)
    protected Date dt_cadastro;

    /**
     * @return the tx_nome
     */
    public String getTx_nome() {
        return tx_nome;
    }

    /**
     * @param tx_nome the tx_nome to set
     */
   public void setTx_nome(String tx_nome) {
        this.tx_nome = tx_nome;
   }

    /**
     * @return the tx_cpf
     */
    public String getTx_cpf() {
        return tx_cpf;
    }

    /**
     * @param tx_cpf the tx_cpf to set
     */
    public void setTx_cpf(String tx_cpf) {
        this.tx_cpf = tx_cpf;
    }

    /**
     * @return the tx_rg
     */
    public String getTx_rg() {
        return tx_rg;
    }

    /**
     * @param tx_rg the tx_rg to set
     */
    public void setTx_rg(String tx_rg) {
        this.tx_rg = tx_rg;
    }

    /**
     * @return the tx_endereco
     */
    public String getTx_endereco() {
        return tx_endereco;
    }

    /**
     * @param tx_endereco the tx_endereco to set
     */
    public void setTx_endereco(String tx_endereco) {
        this.tx_endereco = tx_endereco;
    }

    /**
     * @return the tx_cidade
     */
    public String getTx_cidade() {
        return tx_cidade;
    }

    /**
     * @param tx_cidade the tx_cidade to set
     */
    public void setTx_cidade(String tx_cidade) {
        this.tx_cidade = tx_cidade;
    }

    /**
     * @return the tx_bairro
     */
    public String getTx_bairro() {
        return tx_bairro;
    }

    /**
     * @param tx_bairro the tx_bairro to set
     */
    public void setTx_bairro(String tx_bairro) {
        this.tx_bairro = tx_bairro;
    }

    /**
     * @return the tx_cep
     */
    public String getTx_cep() {
        return tx_cep;
    }

    /**
     * @param tx_cep the tx_cep to set
     */
    public void setTx_cep(String tx_cep) {
        this.tx_cep = tx_cep;
    }

    /**
     * @return the tx_estado
     */
    public String getTx_estado() {
        return tx_estado;
    }

    /**
     * @param tx_estado the tx_estado to set
     */
    public void setTx_estado(String tx_estado) {
        this.tx_estado = tx_estado;
    }

    /**
     * @return the dt_cadastro
     */
    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    /**
     * @return the tx_numero
     */
    public String getTx_numero() {
        return tx_numero;
    }

    /**
     * @param tx_numero the tx_numero to set
     */
    public void setTx_numero(String tx_numero) {
        this.tx_numero = tx_numero;
    }

    
}
