package AVA2_PESSOAS;

import java.time.LocalDate; 

package AVA2_PESSOAS;

import java.time.LocalDate;

public class Funcionario extends Usuario {
    private int matriculaFuncionario;
    private LocalDate dataDeNascimento;

    public Funcionario(String nome, int idade, String endereco, String telefone, String email,
                       String login, String senha, TipoUsuario tipo,
                       int matriculaFuncionario, LocalDate dataDeNascimento) {
        // Supondo que os atributos da superclasse sejam acessados por setters
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        setLogin(login);
        setSenha(senha);
        setTipo(tipo);

        this.matriculaFuncionario = matriculaFuncionario;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}

