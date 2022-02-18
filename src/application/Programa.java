/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produtos;
import entities.enums.PedidoStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author laert
 */
public class Programa {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Cliente :");
        System.out.println(" Nome: ");
        String nome = sc.nextLine();

        System.out.println(" Email : ");
        String email = sc.next();

        System.out.println(" Nascimento (dd / mm /yyyy");
        Date nascimento = sdf.parse(sc.next());

        Cliente cli = new Cliente(nome, email, nascimento);

        System.out.println(" Entre com os dados do Pedido : ");
        System.out.println(" Status :");
        PedidoStatus status = PedidoStatus.valueOf(sc.next());

        System.out.println(" Quantos itens o pedido terá ?  ");
        int n = sc.nextInt();

        Pedido pedido = new Pedido(new Date(), status, cli);

        for (int i = 0; i < n; i++) {

            System.out.println(" Entre com o: " + (i + 1) + " Item ");

            System.out.println(" Nome do Produto  : ");
            sc.nextLine();
            String produtoNome = sc.nextLine();

            System.out.println(" Preço do produto : ");
            double preco = sc.nextDouble();

            System.out.println(" Quantidade do produto : ");
            int quantidade = sc.nextInt();

            Produtos produto = new Produtos(produtoNome, preco);

            PedidoItem itemPedido = new PedidoItem(quantidade, preco, produto);

            pedido.addItens(itemPedido);
        }

        System.out.println();
        System.out.println(pedido.toString());
        sc.close();
    }
}
