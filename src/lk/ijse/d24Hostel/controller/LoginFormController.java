package lk.ijse.d24Hostel.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox showPasswordCheckbox;

    @FXML
    private Button loginButton;

    private String username = "user";
    private String password = "password";

    @FXML
    private void initialize() {
        showPasswordCheckbox.setOnAction(event -> {
            passwordField.setManaged(false);
            passwordField.setVisible(showPasswordCheckbox.isSelected());
        });
    }

    @FXML
    private void handleLogin() {
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    @FXML
    private void handleChangePassword() {
        // You can implement the change password functionality here
        System.out.println("Change password clicked!");
    }
}

