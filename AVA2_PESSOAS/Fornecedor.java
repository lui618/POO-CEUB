package AVA2_PESSOAS;

public class Fornecedor extends Usuario {
    private String cnpj;
    private String razaoSocial;


    // super Classe
    public Fornecedor(String nome, int idade, String endereco, String telefone, String email,
                      String login, String senha, TipoUsuario tipo,
                      String cnpj, String razaoSocial) {
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        setLogin(login);
        setSenha(senha);
        setTipo(tipo);

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}

