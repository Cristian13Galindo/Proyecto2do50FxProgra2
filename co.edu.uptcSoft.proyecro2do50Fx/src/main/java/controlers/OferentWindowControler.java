package controlers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class OferentWindowControler {


    public Button btnBack;
    public Button btnAcceptCargo;
    public TextFlow txtShowJobs;
    
    

    //Metodo para cerrar la ventana
    public void clicBack(ActionEvent actionEvent) {
        Scene scene = ((Node) actionEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
        }


    public void clicAcceptCargo(ActionEvent actionEvent) {
    }

    public void showCharges(ActionEvent actionEvent) {
    }
}


