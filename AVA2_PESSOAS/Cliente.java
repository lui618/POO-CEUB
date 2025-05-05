package AVA2_PESSOAS;

import java.time.LocalDate;

public class Cliente extends Usuario {
    private String cpf;
    private LocalDate dataDeNascimento;

    public Cliente(String nome, int idade, String endereco, String telefone, String email,
                   String login, String senha, TipoUsuario tipo,
                   String cpf, LocalDate dataDeNascimento) {
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        setLogin(login);
        setSenha(senha);
        setTipo(tipo);

        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
