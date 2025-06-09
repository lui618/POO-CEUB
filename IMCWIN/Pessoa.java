// Pessoa.java
// Classe modelo que guarda nome, peso e altura de uma pessoa
public class Pessoa {
    /** Nome da pessoa */
    private final String nomePessoa;
    /** Peso da pessoa em kg */
    private final float pesoPessoa;
    /** Altura da pessoa em metros */
    private final float alturaPessoa;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome   nome da pessoa
     * @param peso   peso da pessoa em kg
     * @param altura altura da pessoa em metros
     */
    public Pessoa(String nome, float peso, float altura) {
        this.nomePessoa   = nome;     // armazena o nome recebido
        this.pesoPessoa   = peso;     // armazena o peso recebido
        this.alturaPessoa = altura;   // armazena a altura recebida
    }

    /**
     * Retorna o nome da pessoa.
     *
     * @return nome da pessoa
     */
    public String getNome() {
        return nomePessoa;  // devolve o nome armazenado
    }

    /**
     * Retorna o peso da pessoa.
     *
     * @return peso da pessoa em kg
     */
    public float getPeso() {
        return pesoPessoa;  // devolve o peso armazenado
    }

    /**
     * Retorna a altura da pessoa.
     *
     * @return altura da pessoa em metros
     */
    public float getAltura() {
        return alturaPessoa;  // devolve a altura armazenada
    }
}
