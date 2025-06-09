// Esta classe serve para manter o estado do usuário logado no sistema.
// Não aplica interface diretamente, mas pode ser usada com polimorfismo se for estendida por outras sessões no futuro.
public class UserSession {
    private static String currentUser;

    public static void login(String username) {
        currentUser = username;
    }

    public static String getCurrentUser() {
        return currentUser;
    }
}
 {
    
}
