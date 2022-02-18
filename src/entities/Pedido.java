/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.PedidoStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author laert
 */
public class Pedido {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date momento;
    private PedidoStatus status;

    private Cliente cliente;

    private List<PedidoItem> items = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
        super();
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItens(PedidoItem item) {
        items.add(item);
    }

    public void removeItens(PedidoItem item) {
        items.remove(item);
    }

    public double total() {

        double soma = 0.0;

        for (PedidoItem it : items) {

            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(" Momento do Pedido ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(" Pedido Status : ");
        sb.append(status + "\n");
        sb.append("Cliente ");
        sb.append(cliente.getNome());
        sb.append(" Pedido Item : \n ");
        for (PedidoItem item : items) {
            sb.append(item + "\n");
        }
        sb.append(" Total Preco $ ");
        sb.append(String.format("%.2f", total()));
        
        return sb.toString();
    }
}
