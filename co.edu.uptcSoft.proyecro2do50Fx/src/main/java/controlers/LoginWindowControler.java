package controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.HelloApplication;

import java.io.IOException;
import java.util.Objects;

public class LoginWindowControler {

    /*
    ** Atributos
    */
    //Este es el boton para loguearse
    public Button btnAcces;

    //Este es el campo de ingreso de la contraseña
    public PasswordField txtPassword;

    //Este es el boton para crear un usuario
    //debe tener conexion con la ventana CreateUserWindow
    public Button btnCreateUser;

    //Este es el campo de ingreso del usuario
    public TextField txtUser;

    //Stage
    Stage createUserWindowStage = new Stage();


    /*
    ** Dos eventos de botones
    */
    //Boton para ingresar usuario

    // Atributos para los botones:
    String userTxt, passwordTxt;
    public void clicSignIn(ActionEvent actionEvent) {
        userTxt = txtUser.getText();
        passwordTxt = txtPassword.getText();

        if ((Objects.equals(userTxt, "camilo")) && (Objects.equals(passwordTxt, "1234"))) {
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación exitosa, Bienvenido al sistema");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("Bienvenido a nuestro sistema");
            messageWindow.showAndWait();
        }else{
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Error de acceso");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("USUARIO O PASSWORD INCORRECTOS");
            messageWindow.showAndWait();
        }
    }

    //Boton para ir a la ventana de crear usuario
    public void clicSignUp(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createUserWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 550);
            createUserWindowStage.setTitle("Transportes Uptc/createUserWindow");
            createUserWindowStage.setScene(scene);
            createUserWindowStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Boton "atras" solo sirve para cerrar la ventana realmente
    public void clicBack(ActionEvent actionEvent) {
    }


    //Aqui comienza la logica de la ventana
}
