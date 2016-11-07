/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente extends Pessoa{
    
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Id
    protected int id_cliente;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;
    
    public Cliente (){
        
        this.id_cliente = 0;
        
        this.id_usuario = new Usuario();
        
    }
    
    /**
     * @return the tx_nome
     */
    public String getNome() {
        return super.getTx_nome();
    }

    /**
     * @param tx_nome the tx_nome to set
     */
    public void setNome(String tx_nome) {
        super.setTx_nome(tx_nome);
    }

    /**
     * @return the tx_cpf
     */
    public String getCpf() {
        return super.getTx_cpf();
    }

    /**
     * @param tx_cpf the tx_cpf to set
     */
    public void setCpf(String tx_cpf) {
        super.setTx_cpf(tx_cpf);
    }

    /**
     * @return the tx_rg
     */
    public String getRg() {
        return super.getTx_rg();
    }

    /**
     * @param tx_rg the tx_rg to set
     */
    public void setRg(String tx_rg) {
        super.setTx_rg(tx_rg);
    }

    /**
     * @return the tx_endereco
     */
    public String getEndereco() {
        return super.getTx_endereco();
    }

    /**
     * @param tx_endereco the tx_endereco to set
     */
    public void setEndereco(String tx_endereco) {
        super.setTx_endereco(tx_endereco);
    }

    /**
     * @return the tx_cidade
     */
    public String getCidade() {
        return super.getTx_cidade();
    }

    /**
     * @param tx_cidade the tx_cidade to set
     */
    public void setCidade(String tx_cidade) {
        super.setTx_cidade(tx_cidade);
    }

    /**
     * @return the tx_bairro
     */
    public String getBairro() {
        return super.getTx_bairro();
    }

    /**
     * @param tx_bairro the tx_bairro to set
     */
    public void setBairro(String tx_bairro) {
        super.setTx_bairro(tx_bairro);
    }

    /**
     * @return the tx_numero
     */
    public String getNumero() {
        return super.getTx_numero();
    }

    /**
     * @param tx_numero the in_numero to set
     */
    public void setNumero(String tx_numero) {
        super.setTx_numero(tx_numero);
    }

    /**
     * @return the tx_cep
     */
    public String getCep() {
        return super.getTx_cep();
    }

    /**
     * @param tx_cep the tx_cep to set
     */
    public void setCep(String tx_cep) {
        super.setTx_cep(tx_cep);
    }

    /**
     * @return the tx_estado
     */
    public String getEstado() {
        return super.getTx_estado();
    }

    /**
     * @param tx_estado the tx_estado to set
     */
    public void setEstado(String tx_estado) {
        super.setTx_estado(tx_estado);
    }

    /**
     * @return the dt_cadastro
     */
    public Date getDataCadastro() {
        return super.getDt_cadastro();
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDataCadastro(Date dt_cadastro) {
        super.setDt_cadastro(dt_cadastro);
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return id_usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String toString() 
    {
        
    return getNome();

    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
