package AVA2_PEDIDOS;

public class Vendedor {
  private String nome;
  private int matricula;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public Vendedor(String nome, int matricula) {
      this.nome = nome;
      this.matricula = matricula;
  }
}