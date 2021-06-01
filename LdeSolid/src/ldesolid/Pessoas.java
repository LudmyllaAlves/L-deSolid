/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldesolid;

/**
 *
 * @author tatia
 */
public class Pessoas {
    private String nome;
    private String endereço;
    private int cnpj;
    private int cpf;

    public Pessoas(String nome, String endereço, int cnpj) {
        this.nome = nome;
        this.endereço = endereço;
        this.cnpj = cnpj;
    }
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
    
    
   
    
}
