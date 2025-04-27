package AVA2_PEDIDOS;

public class ItemPedido {
  private int codigoDoProduto;
  private String descricao;
  private int quantidade;
  private double precoUnitario;

  public ItemPedido(int codigoDoProduto, String descricao, int quantidade, double precoUnitario) {
      this.codigoDoProduto = codigoDoProduto;
      this.descricao = descricao;
      this.quantidade = quantidade;
      this.precoUnitario = precoUnitario;
  }

  public double calcularValorItem() {
      return quantidade * precoUnitario;
  }

  @Override
  public String toString() {
      return "Produto: " + descricao + " (Código: " + codigoDoProduto + ", Quantidade: " + quantidade + ")";
  }
}

