package controlers;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    }


    //Aqui comienza la logica de la ventana
}
