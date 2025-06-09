// Esta classe representa um usuário com seus dados básicos.
// Não usa diretamente interface ou polimorfismo, mas pode ser usada em conjunto com a interface futuramente.
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
