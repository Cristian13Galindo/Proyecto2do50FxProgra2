package controlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import logic.CargoHangling;
import ui.HelloApplication;

import java.io.IOException;
import java.util.Objects;

import static ui.HelloApplication.completeCombo;

public class LoginWindowControler {
//    contructor de cargoHandling
    CargoHangling Ch = new CargoHangling();
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

    // boton atras
    public Button btnBack;

    //rol en el combobox
    public ComboBox cbRol;
    ObservableList<String> rolesListCombo = FXCollections.observableArrayList("Compañia","Oferente");

    //Stage
    Stage createUserWindowStage = new Stage();


    /*
    ** Dos eventos de botones
    */
    //Boton para ingresar usuario

    // Atributos para los botones:
    String userTxt, passwordTxt;
    byte typeRoll ;
    public void clicSignIn(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        userTxt = txtUser.getText();
        passwordTxt = txtPassword.getText();
        typeRoll = (byte) cbRol.getSelectionModel().getSelectedIndex();
        if (Ch.loginUser(userTxt,passwordTxt,typeRoll ) == 1) {
//            ofernte
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación exitosa, Bienvenido al sistema");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("Bienvenido Señor Oferente");
            messageWindow.showAndWait();
        }else if(Ch.loginUser(userTxt,passwordTxt,typeRoll ) == 0){
//            companies
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación exitosa, Bienvenido al sistema");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("Bienvenida Compañia");
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
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }

    //Combobox que lista los roles
    public void rolesList(Event event) {
        completeCombo(cbRol, rolesListCombo);

    }


    //Aqui comienza la logica de la ventana
}
