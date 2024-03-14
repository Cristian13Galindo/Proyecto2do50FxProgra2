package ui;

import controlers.LoginWindowControler;
import controlers.CreateUserWindowControler;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage currentStage;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 725, 500);
        stage.setTitle("Transportes Uptc");
        stage.setScene(scene);
        stage.show();
    }

    //METODO PARA GESTIONAR LOS COMBOBOX
    public static void completeCombo(ComboBox<String> llenarCombo, ObservableList<String> informacionCombo){
        llenarCombo.setItems(informacionCombo);
    }


    //Metodo para cerrar las ventanas
    public void closeWindows(Stage stage){
        stage.close();
    }


    public static void main(String[] args) {
        launch();
    }
}