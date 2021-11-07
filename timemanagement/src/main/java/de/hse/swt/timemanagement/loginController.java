package de.hse.swt.timemanagement;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField usrInput;

    @FXML
    private PasswordField pwdInput;

    @FXML
    private void exit() {
        App.exit();
    }

    @FXML
    private void minimize() {
        App.minimize();
    }

    @FXML
    private void login() throws IOException {
        DBUtils.logInUser(usrInput.getText(), pwdInput.getText());
    }

    @FXML
    private void mailTo() throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        URI mailto = new URI("mailto:support@tms.de?subject=Problem%20with%20the%20Software");
        desktop.mail(mailto);
    }
}
