package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
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
            String login = login_field.getText().trim();
            String password = password_field.getText().trim();

            if (!login.equals("") && !password.equals(""))
                loginUser(login, password);
            else
                System.out.println("login or password is empty");
        });


        registrationButoon.setOnAction(event -> {
            registrationButoon.getScene().getWindow().hide();

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/sample/signUp.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();






        });
    }

    private void loginUser(String login, String password) {
    }
}
