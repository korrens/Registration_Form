import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private static JTextField nameText;
    private static JTextField emailText;
    private static JPasswordField passwordText;
    private static JPasswordField confirmPasswordText;
    private static JRadioButton maleButton;
    private static JCheckBox rules;
    private static JLabel nameLabels;
    private static JLabel emailLabels;
    private static JLabel passwordLabels;
    private static JLabel confirmPasswordLabels;

    public void loginForm() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        // Frame, panel, title
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Registration Form");

        panel.setLayout(null);

        // Heading
        JLabel headingLabel = new JLabel("REGISTRATION FORM");
        headingLabel.setBounds(285, 25, 160, 25);
        panel.add(headingLabel);

        // Labels and Text fields
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(150, 70, 80, 25);
        panel.add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(270, 70, 165, 25);
        panel.add(nameText);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(150, 100, 80, 25);
        panel.add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(270,100,60,25);
        panel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(370,100,100,25);
        panel.add(femaleButton);

        // Made a button group just to remove option when both can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        JLabel emailLabel = new JLabel("E-mail");
        emailLabel.setBounds(150, 130, 80, 25);
        panel.add(emailLabel);

        emailText = new JTextField();
        emailText.setBounds(270, 130, 165, 25);
        panel.add(emailText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150, 160, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(270, 160, 165, 25);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirm password");
        confirmPasswordLabel.setBounds(150, 190, 120, 25);
        panel.add(confirmPasswordLabel);

        confirmPasswordText = new JPasswordField();
        confirmPasswordText.setBounds(270, 190, 165, 25);
        panel.add(confirmPasswordText);

        // Checkbox
        rules = new JCheckBox("I agree to website terms and policy!");
        rules.setBounds(240,220,300,25);
        panel.add(rules);

        // Button
        JButton button = new JButton("Submit");
        button.setBounds(300, 260, 100, 25);
        panel.add(button);

        button.addActionListener(new Login());

        // User inputted Text
        nameLabels = new JLabel();
        nameLabels.setBounds(200, 310, 120, 20);
        panel.add(nameLabels);

        emailLabels = new JLabel();
        emailLabels.setBounds(200, 340, 160, 20);
        panel.add(emailLabels);

        passwordLabels = new JLabel();
        passwordLabels.setBounds(200, 370, 120, 20);
        panel.add(passwordLabels);

        confirmPasswordLabels = new JLabel();
        confirmPasswordLabels.setBounds(200, 400, 120, 20);
        panel.add(confirmPasswordLabels);


        frame.setVisible(true);

    }

// Action Listener
    @Override
    public void actionPerformed(ActionEvent e) {
        // Grab user input
        String name = nameText.getText();
        String email = emailText.getText();
        String password = String.valueOf(passwordText.getPassword());
        String confirmPassword = String.valueOf(confirmPasswordText.getPassword());

        // Print in console with true/false gender and checkbox
        System.out.println(name + ", " + maleButton.isSelected() + ", " + email + ", " + password + ", " + confirmPassword + ", " + rules.isSelected());

        // Print in field without gender and checkbox
        String nameFieldValue = nameText.getText();
        nameLabels.setText(nameFieldValue);

        String emailFieldValue = emailText.getText();
        emailLabels.setText(emailFieldValue);

        String passwordFieldValue = passwordText.getText();
        passwordLabels.setText(passwordFieldValue);

        String confirmPasswordFieldValue = confirmPasswordText.getText();
        confirmPasswordLabels.setText(confirmPasswordFieldValue);

        System.out.println(nameFieldValue + " " + emailFieldValue + " " + passwordFieldValue + " " + confirmPasswordFieldValue);
    }
        }
