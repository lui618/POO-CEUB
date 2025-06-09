// Esta classe implementa a interface LoginService, utilizando POLIMORFISMO.
// Isso permite usar esta classe de forma genérica por meio do tipo LoginService.
public class AuthenticationService implements LoginService {

    @Override
    public boolean authenticate(String username, String password) throws Exception {
        return username.equals("denys") && password.equals("poo123456");
    }
}
