/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vicniencia.modelo;

import java.util.Calendar;

/**
 *
 * @author victo
 */
public class Fornecedor extends Pessoa {
     private String representacao; //marcas que o fornecedor representa    
    
    
     public Fornecedor(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco, String representacao)
    {
       
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.representacao = representacao;
              
        
    }
    
    
    
     public String getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(String representacao) {
        this.representacao = representacao;
    }
}
