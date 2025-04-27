package AVA2_PEDIDOS;

public class Cliente {
  private String nome;
  private String CPF;
  private String endereco;
  private String telefone;

  public Cliente(String nome, String CPF, String endereco, String telefone) {
      this.nome = nome;
      this.CPF = CPF;
      this.endereco = endereco;
      this.telefone = telefone;
  }

  public String getNome() {
      return nome;
  }

  public String getCPF() {
      return CPF;
  }

  public String getEndereco() {
      return endereco;
  }

  public String getTelefone() {
      return telefone;
  }

  @Override
  public String toString() {
      return "Cliente: " + nome + " (CPF: " + CPF + ")";
  }
}

