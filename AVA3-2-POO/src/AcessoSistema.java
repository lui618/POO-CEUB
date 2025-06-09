public class AcessoSistema {
    public static void main(String[] args) {
        // Aqui usamos POLIMORFISMO ao instanciar a interface LoginService com a classe Auth.
        // Isso permite trocar a implementação facilmente no futuro, sem mudar a lógica do programa.
        LoginService service = new AuthenticationService();

        javax.swing.SwingUtilities.invokeLater(() -> {
            new Front(service).setVisible(true);
        });
    }
}
