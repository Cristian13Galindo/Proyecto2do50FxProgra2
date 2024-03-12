package controlers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ui.HelloApplication;

import java.io.IOException;

public class MainWindowControler {

    Stage loginWindowStage = new Stage();

    //Metodo que llama a la ventana loginWindow
    public void callLoginWindow(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 550);
            loginWindowStage.setTitle("Transportes Uptc");
            loginWindowStage.setScene(scene);
            loginWindowStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    //Metodo que llama a la ventana CreateUserWindow
    public void callCreateUserWindow(MouseEvent mouseEvent) {
    }

    public void closeWindow(MouseEvent mouseEvent) {
        loginWindowStage.close();
    }
}
