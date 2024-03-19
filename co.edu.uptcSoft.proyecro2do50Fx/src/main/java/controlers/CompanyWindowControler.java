package controlers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import logic.CargoHangling;

import java.io.IOException;

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

    //Conexion con la clase manejadora
    CargoHangling cargoHangling = new CargoHangling();

    //conexion con la clase loginWindow
    LoginWindowControler loginWindowControler = new LoginWindowControler();

    //Aqui valido el nombre del usuario y adicional lo muestro en la venatana
    String userNameTxt = String.valueOf(loginWindowControler.getTxtUser());

    //Metodo para cerrar la venta
    public void clicBack(ActionEvent actionEvent) {
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }


    //Metodo para mostrar el nombre
    /*public void showNameLabel(){
        txtShowNameUser.setText(userNameTxt);
    }*/


    /*Metodo para crear una carga a partir de los requerimientos
    * material a transportar: txtDescriptionCharge
    * origen: txtOriginCharge
    * destino: txtDestinationCharge
    * valor: txtValueCharge
    * id de la carga: txtIdCharge
    * */

    String descriptionChargeTxt, originChargeTxt, destinationChargeTxt, valueChargeTxt, idChargeTxt;
    public void clicCreateCargo(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        descriptionChargeTxt = txtDescriptionCharge.getText();
        originChargeTxt = txtOriginCharge.getText();
        destinationChargeTxt = txtDestinationCharge.getText();
        valueChargeTxt = txtValueCharge.getText();
        idChargeTxt = txtIdCharge.getText();


        if (!descriptionChargeTxt.isEmpty() && !originChargeTxt.isEmpty() && !destinationChargeTxt.isEmpty() && !valueChargeTxt.isEmpty() && !idChargeTxt.isEmpty()) {

            cargoHangling.createCharge(userNameTxt,descriptionChargeTxt,originChargeTxt,destinationChargeTxt, Double.valueOf(valueChargeTxt),idChargeTxt);

            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación exitosa");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("Carga creada exitosamente");
            messageWindow.showAndWait();


        }else {
            Alert messageWindow = new Alert(Alert.AlertType.INFORMATION);
            messageWindow.setTitle("Validación erronea");
            messageWindow.setHeaderText("");
            messageWindow.setContentText("La carga no fue creada, revise que los campos estén completos");
            messageWindow.showAndWait();
        }
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();


    }
}


