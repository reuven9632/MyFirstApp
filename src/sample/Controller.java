package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authButton;

    @FXML
    private TextField login_field;

    @FXML
    private Button registrationButoon;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        authButton.setOnAction(event -> {

        });
    }
}
