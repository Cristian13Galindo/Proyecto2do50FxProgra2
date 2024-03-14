package controlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.HelloApplication;
import static ui.HelloApplication.completeCombo;

public class CreateUserWindowControler {

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
}
