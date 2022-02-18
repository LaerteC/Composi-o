/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author laert
 */
public class Cliente {
    
    private String nome;
    private String email;
    private Date nascimento;
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Cliente(){
        
    }
    
    public Cliente(String nome,String email,Date nascimento){
        
        super();
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    @Override
    public String toString(){
        
        return nome + "(" + sdf.format(nascimento) +" ) -" + email;
    }
}
