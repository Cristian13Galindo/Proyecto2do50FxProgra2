package controlers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import logic.CargoHangling;

public class CompanyWindowControler {

    //Atributos
    public TextField txtDescriptionCharge;
    public TextField txtOriginCharge;
    public TextField txtDestinationCharge;
    public TextField txtValueCharge;
    public TextField txtIdCharge;
    public Button btnCreateCargo;
    public TextFlow txtShowNameUser;
    public Button btnBack;

    //Conexion con la clase manejadora
    CargoHangling cargoHangling = new CargoHangling();

    //Metodo para cerrar la venta
    public void clicBack(ActionEvent actionEvent) {
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }

    /*Metodo para crear una carga a partir de los requerimientos
    * material a transportar: txtDescriptionCharge
    * origen: txtOriginCharge
    * destino: txtDestinationCharge
    * valor: txtValueCharge
    * id de la carga: txtIdCharge
    * */

    String descriptionChargeTxt, originChargeTxt, destinationChargeTxt, valueChargeTxt, idChargeTxt;
    public void clicCreateCargo(ActionEvent actionEvent) {
        descriptionChargeTxt = txtDescriptionCharge.getText();
        originChargeTxt = txtOriginCharge.getText();
        destinationChargeTxt = txtDestinationCharge.getText();
        valueChargeTxt = txtValueCharge.getText();
        idChargeTxt = txtIdCharge.getText();

        if (!descriptionChargeTxt.isEmpty() && !originChargeTxt.isEmpty() && !destinationChargeTxt.isEmpty() && !valueChargeTxt.isEmpty() && !idChargeTxt.isEmpty()) {


            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación exitosa, Bienvenido al sistema");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("Bienvenido a nuestro sistema");
            messageWindow.showAndWait();
        }else {
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Error de acceso");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("USUARIO O PASSWORD INCORRECTOS");
            messageWindow.showAndWait();
        }



    }
}


