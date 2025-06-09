public class AcessoSistema {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            LoginService service = new Auth();
            new Front(service).setVisible(true);
        });
    }
}

