package AVA2_PEDIDOS;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
     
      Vendedor vendedor = new Vendedor("João da Silva", 12345);

      
      Cliente cliente = new Cliente("Maria Souza", "123.456.789-00", "Rua X, 123", "(61) 99999-9999");

      
      Pedido pedido = new Pedido(vendedor, cliente, null, null, null, 0);

     
      ItemPedido item1 = new ItemPedido(101, "Produto A", 2, 50.0);
      ItemPedido item2 = new ItemPedido(102, "Produto B", 1, 30.0);

      
      pedido.adicionarItem(item1);
      pedido.adicionarItem(item2);

      
      System.out.println(pedido);

     
      System.out.println("Valor total do pedido: " + pedido.calcularValorTotal());

      
      pedido.atualizarStatus("ENVIADO");
      System.out.println("Novo status do pedido: " + pedido);
  }
}
