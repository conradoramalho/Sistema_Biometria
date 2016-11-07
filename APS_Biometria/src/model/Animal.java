/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal implements Serializable {
    
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Id
    private int id_animal;
    private String tx_categoria;
    private String tx_nome;
    private String tx_raca;
    @ManyToOne
    @JoinColumn(name ="id_cliente" )
    private Cliente id_cliente;
    
    public Animal () {
        
        this.id_animal = 0;
        this.tx_categoria = "";
        this.tx_nome = "";
        this.tx_raca = "";
        id_cliente = new Cliente();
    }


    public int getId_animal() {
        return id_animal;
    }
    /**
     * @param id_animal the id_animal to set
     */
    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    /**
     * @return the tx_categoria
     */
    public String getTx_categoria() {
        return tx_categoria;
    }

    /**
     * @param tx_categoria the tx_categoria to set
     */
    public void setTx_categoria(String tx_categoria) {
        this.tx_categoria = tx_categoria;
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
     * @return the tx_raca
     */
    public String getTx_raca() {
        return tx_raca;
    }

    /**
     * @param tx_raca the tx_raca to set
     */
    public void setTx_raca(String tx_raca) {
        this.tx_raca = tx_raca;
    }

    /**
     * @return the id_cliente
     */
    public Cliente getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Object id_cliente) {
        this.id_cliente = (Cliente) id_cliente;
    }

    public int toInt(){
        return id_animal;
    }

    public String toString(){
        return getTx_nome();
    }
}
