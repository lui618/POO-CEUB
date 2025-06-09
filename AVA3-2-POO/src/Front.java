
import java.awt.*;
import javax.swing.*;

public class Front extends JFrame {

    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JButton newUserButton;
    private LoginService loginService;

    public Front(LoginService service) {
        this.loginService = service;
        setTitle("Acesso ao Sistema");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initComponents();
        addListeners();

        JOptionPane.showMessageDialog(this,
                "Bem-vindo, Denys!",
                "Mensagem Inicial",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        formPanel.add(new JLabel("Usuário:"));
        userField = new JTextField();
        formPanel.add(userField);

        formPanel.add(new JLabel("Senha:"));
        passwordField = new JPasswordField();
        formPanel.add(passwordField);

        add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Entrar");
        cancelButton = new JButton("Cancelar");
        newUserButton = new JButton("Novo Usuário");

        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(newUserButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passwordField.getPassword());
            try {
                if (loginService.authenticate(username, password)) {
                    JOptionPane.showMessageDialog(this,
                            "Bem-vindo, " + username + "!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Login inválido!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro: " + ex.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> System.exit(0));

        newUserButton.addActionListener(e
                -> JOptionPane.showMessageDialog(this,
                        "Em desenvolvimento.",
                        "Mensagem",
                        JOptionPane.INFORMATION_MESSAGE));
    }
}
