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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tarefa implements Serializable{
       
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Id
    @PrimaryKeyJoinColumn(name="id_tarefa", referencedColumnName="id_tarefa")
    private int id_tarefa;
    private String tx_nome;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;
    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal id_animal;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente id_cliente;
    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico id_servico;
    @Temporal(TemporalType.DATE)
    private Date dt_tarefa;
    
    public Tarefa(){
        
        this.id_tarefa = 0;
        this.tx_nome = "";
        this.dt_tarefa = new Date();
    }

    /**
     * @return the id_tarefa
     */
    public int getId_tarefa() {
        return id_tarefa;
    }

    /**
     * @param id_tarefa the id_tarefa to set
     */
    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
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
     * @return the id_usuario
     */
    public String getId_usuario() {
        return id_usuario.getTx_nome();
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_animal
     */
    public String getId_animal() {
        return id_animal.getTx_nome();
    }

    /**
     * @param id_animal the id_animal to set
     */
    public void setId_animal(Animal id_animal) {
        this.id_animal = id_animal;
    }

    /**
     * @return the id_servico
     */
    public Servico getId_servico() {
        return id_servico;
    }

    /**
     * @param id_servico the id_servico to set
     */
    public void setId_servico(Servico id_servico) {
        this.id_servico = id_servico;
    }

    /**
     * @return the dt_tarefa
     */
    public Date getDt_tarefa() {
        return dt_tarefa;
    }

    /**
     * @param dt_tarefa the dt_tarefa to set
     */
    public void setDt_tarefa(Date dt_tarefa) {
        this.dt_tarefa = dt_tarefa;
    }

    public String toString() 
    {
        
    return this.getTx_nome();

    }

    /**
     * @return the id_cliente
     */
    public String getId_cliente() {
        return id_cliente.getNome();
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }
    /*
    public String getClienteNome(){
        
        return id_cliente.getNome();
        
    }*/
    
    
}
