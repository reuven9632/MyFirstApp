package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private Button registrationButoon;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField lastName;

    @FXML
    private TextField userLocation;

    @FXML
    private RadioButton gender;

    @FXML
    private TextField firstName;

    @FXML
    void initialize() {
        DataBaseHandler dbHandler = new DataBaseHandler();
        registrationButoon.setOnAction(event -> {
            dbHandler.signUpUser(firstName.getText(), lastName.getText(), loginField.getText(), passwordField.getText(), userLocation.getText(), "Male");



            registrationButoon.getScene().getWindow().hide();

            Parent root = null;
            try{
                root = FXMLLoader.load(getClass().getResource("/sample/appHome.fxml"));
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });
    }
}
