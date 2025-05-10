import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton;
    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        // Username Panel
        JPanel userPanel = new JPanel(new FlowLayout());
        userPanel.add(new JLabel("Username:"));
        userTextField = new JTextField(15);
        userPanel.add(userTextField);

        // Password Panel
        JPanel passPanel = new JPanel(new FlowLayout());
        passPanel.add(new JLabel("Password:"));
        passField = new JPasswordField(15);
        passPanel.add(passField);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        buttonPanel.add(loginButton);

        // Adding panels to frame
        add(new JLabel("  Please Login", SwingConstants.CENTER));
        add(userPanel);
        add(passPanel);
        add(buttonPanel);

        setVisible(true);
    }

    // Action performed on button click
    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passField.getPassword());

        // Hardcoded login check
        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
            // You can redirect to a new window here
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }

    // Main method
    public static void main(String[] args) {
        new LoginForm();
    }
}
