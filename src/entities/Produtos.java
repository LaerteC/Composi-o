/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author laert
 */
public class Produtos {
    
    private String nome;
    private Double preco;
    
    public Produtos(){
        
    }
    
    public Produtos(String nome,Double preco){
        
        super();
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome =nome;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    
}
