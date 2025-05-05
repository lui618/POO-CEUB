package AVA2_PESSOAS;

public abstract class Usuario {
    private String nome;
    private int idade; 
    private String endereco; 
    private String telefone;
    private String email;
    private String login;
    private String senha;

    public enum TipoUsuario {
        FUNCIONARIO,
        CLIENTE,
        FORNECEDOR
    }

    private TipoUsuario tipo;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    // Métodos de operação
    public void cadastrarUsuario() {}

    public void apagarUsuario() {}

    public void atualizarUsuario() {}

    public Usuario selecionarUsuario() {
        return null;
    }
}
