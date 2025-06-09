public class Auth implements LoginService {
    @Override
    public boolean authenticate(String username, String password) throws Exception {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Usuário ou senha vazios.");
        }

        // Usuário de teste
        return username.equals("denys") && password.equals("poo123456");
    }
}

