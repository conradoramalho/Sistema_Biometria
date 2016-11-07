/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Servico implements Serializable {
    
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Id
    private int id_servico;
    private String tx_nome;
    @Temporal(TemporalType.DATE)
    private Date dt_cadastro;
    private Boolean fl_ativo;

    public Servico (){
        
        this.id_servico = 0;
        this.tx_nome = "";
        this.dt_cadastro = new Date();
        this.fl_ativo = false;
    }
    
       
    public int toInt() 
    {
        
    return this.getId_servico();

    }

    /**
     * @return the id_servico
     */
    public int getId_servico() {
        return id_servico;
    }

    /**
     * @param id_servico the id_servico to set
     */
    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

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
    
    public String toString(){
        return getTx_nome();
    }
}
