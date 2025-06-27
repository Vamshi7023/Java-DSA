import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;

public class EmailRegistration {
    private static HashSet<String> registeredEmails = new HashSet<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Email Registration");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.weightx = 1;

        Font fieldFont = new Font("Arial", Font.PLAIN, 16);
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        JLabel lblFirstName = new JLabel("First Name:");
        JTextField txtFirstName = new JTextField(20);
        txtFirstName.setFont(fieldFont);
        JLabel lblLastName = new JLabel("Last Name:");
        JTextField txtLastName = new JTextField(20);
        txtLastName.setFont(fieldFont);
        JLabel lblEmail = new JLabel("Email ID:");
        JTextField txtEmail = new JTextField(20);
        txtEmail.setFont(fieldFont);
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(20);
        txtPassword.setFont(fieldFont);
        JLabel lblMobile = new JLabel("Mobile Number:");
        JTextField txtMobile = new JTextField(20);
        txtMobile.setFont(fieldFont);
        JLabel lblRefEmail = new JLabel("Reference Email ID:");
        JTextField txtRefEmail = new JTextField(20);
        txtRefEmail.setFont(fieldFont);

        JButton btnRegister = new JButton("Register");
        btnRegister.setFont(buttonFont);
        JButton btnReset = new JButton("Reset");
        btnReset.setFont(buttonFont);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(buttonFont);

        btnRegister.addActionListener(e -> {
            String email = txtEmail.getText();
            if (registeredEmails.contains(email)) {
                JOptionPane.showMessageDialog(frame, "Email already exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                registeredEmails.add(email);
                JOptionPane.showMessageDialog(frame, "You have successfully registered", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        ActionListener resetAction = e -> {
            txtFirstName.setText("");
            txtLastName.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
            txtMobile.setText("");
            txtRefEmail.setText("");
        };

        btnReset.addActionListener(resetAction);
        btnCancel.addActionListener(resetAction);

        gbc.gridy = 0; frame.add(lblFirstName, gbc);
        gbc.gridy++; frame.add(txtFirstName, gbc);
        gbc.gridy++; frame.add(lblLastName, gbc);
        gbc.gridy++; frame.add(txtLastName, gbc);
        gbc.gridy++; frame.add(lblEmail, gbc);
        gbc.gridy++; frame.add(txtEmail, gbc);
        gbc.gridy++; frame.add(lblPassword, gbc);
        gbc.gridy++; frame.add(txtPassword, gbc);
        gbc.gridy++; frame.add(lblMobile, gbc);
        gbc.gridy++; frame.add(txtMobile, gbc);
        gbc.gridy++; frame.add(lblRefEmail, gbc);
        gbc.gridy++; frame.add(txtRefEmail, gbc);
        gbc.gridy++; frame.add(btnRegister, gbc);
        gbc.gridy++; frame.add(btnReset, gbc);
        gbc.gridy++; frame.add(btnCancel, gbc);

        frame.setVisible(true);
    }
}