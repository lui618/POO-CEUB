// Esta é uma INTERFACE que define o contrato para autenticação.
// Usamos interface aqui para permitir que diferentes classes implementem formas distintas de autenticação (ex: banco, API, etc).
public interface LoginService {
    boolean authenticate(String username, String password) throws Exception;
}
