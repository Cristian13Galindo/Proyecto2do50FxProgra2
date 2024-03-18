package controlers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CompanyWindowControler {

    //Atributos
    public TextField txtDescriptionCharge;
    public TextField txtOriginCharge;
    public TextField txtDestinationCharge;
    public TextField txtValueCharge;
    public TextField txtIdCharge;
    public Button btnCreateCargo;
    public Label txtShowNameUser;
    public Button btnBack;

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
    public void clicCreateCargo(ActionEvent actionEvent) {
    }
}


