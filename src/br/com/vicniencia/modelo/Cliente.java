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
public class Cliente extends Pessoa {

    
    private String cartaoFidelidade;
    
    
    
    public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco)
    {
       
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
              
        
    }
     

    public String getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(String cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }
}
