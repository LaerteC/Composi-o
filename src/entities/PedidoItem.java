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
public class PedidoItem {
    
    private Integer quantidade;
    private Double preco;
    
    private Produtos produto;
    
    public PedidoItem(){
        
    }
    
    public PedidoItem(Integer quantidade,Double preco,Produtos produto){
        super();
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    
    public double subTotal(){
        return preco * quantidade;
    }
    
    @Override
    public String toString(){
        
        String retorno ="  Quantidade de Itens " + quantidade + " Preço Total $ : "+String.format("%.2f",subTotal())
                + " Nome do Produto : " + getProduto().getNome();
        return retorno;
    }
}
