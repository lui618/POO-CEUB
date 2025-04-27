package AVA2_PEDIDOS;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;



public class Pedido {
    private Vendedor vendedor;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String status ="Processando";
    private LocalDateTime dataHora = LocalDateTime.now();
    private double valorTotal=0.0;


    public Pedido(Vendedor vendedor, Cliente cliente, List<ItemPedido> itens, String status, LocalDateTime dataHora,
        double valorTotal) {
      this.vendedor = vendedor;
      this.cliente = cliente;
      this.itens = itens != null ? itens : new ArrayList<>();
      this.status = status;
      this.dataHora = LocalDateTime.now();
      this.valorTotal = valorTotal;
    }

    public void adicionarItem(ItemPedido item) {
      itens.add(item);
    }
    
    public void removerItem(ItemPedido item) {
      itens.remove(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularValorItem();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
      this.status = novoStatus;
    }
    
    public void aplicarDesconto(int percentual) {
      this.valorTotal -= (valorTotal * percentual) / 100;
    }

    @Override
    public String toString() {
        return " Status: " + status + "\nCliente: " + cliente.getNome() + "\nVendedor: " + vendedor.getNome();
    }
}
