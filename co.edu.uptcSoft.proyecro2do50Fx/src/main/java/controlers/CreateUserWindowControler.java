package controlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import logic.CargoHangling;
import ui.HelloApplication;

import java.io.IOException;

import static ui.HelloApplication.completeCombo;

public class CreateUserWindowControler {

    // Esto es objeto de la clase CargoHandling
    CargoHangling Ch = new CargoHangling();

    //rol en el combobox
    public TextField txtNewUser;
    public PasswordField txtPassword;
    public Button btnCreateNewUser;
    public Button btnBack;

    //para el combo
    public ComboBox cbRol;
    ObservableList<String> rolesListCom = FXCollections.observableArrayList("Compañia","Oferente");

    //Metodo para ir con el boton atras
    public void clicBack(ActionEvent actionEvent) {
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
        
    }

    //Metodo para darle los roles al combo
    public void rolesList(Event event) {
        completeCombo(cbRol, rolesListCom);

    }
//    atrubutos para los botones
    String userTxt, passwordTxt;
    byte typeRoll;
    //Boton para crear un usuario
    public void clicSignUp(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        userTxt = txtNewUser.getText();
        passwordTxt = txtPassword.getText();
        int indexCbroll = cbRol.getSelectionModel().getSelectedIndex();
        typeRoll = (byte) indexCbroll;
        Ch.createUser(userTxt, passwordTxt, typeRoll);
        Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
        messageWindow.setTitle("Validación exitosa, Bienvenido al sistema");
        messageWindow.setHeaderText("");
        messageWindow.setContentText("Usuario Creado Exitosamente");
        messageWindow.showAndWait();
    }
}
