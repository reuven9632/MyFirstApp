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
        assert authButton != null : "fx:id=\"authButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'sample.fxml'.";
        assert registrationButoon != null : "fx:id=\"registrationButoon\" was not injected: check your FXML file 'sample.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
