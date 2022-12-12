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
public class Funcionario extends Pessoa {
     private String numeroCartaoPonto;
    
    public Funcionario(int id, String numeroCartaoPonto, String nome, Calendar dataNascimento, String documento, String telefone, String email, Endereco endereco) {
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.numeroCartaoPonto = numeroCartaoPonto;
    }

    public String getNumeroCartaoPonto() {
        return numeroCartaoPonto;
    }

    public void setNumeroCartaoPonto(String numeroCartaoPonto) {
        this.numeroCartaoPonto = numeroCartaoPonto;
    }
    
}
