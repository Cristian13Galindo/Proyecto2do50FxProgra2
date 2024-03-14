package controlers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
            loginWindowStage.setTitle("Transportes Uptc/loginWindow");
            loginWindowStage.setScene(scene);
            loginWindowStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Metodo que llama a la ventana CreateUserWindow
    public void callCreateUserWindow(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createUserWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 550);
            loginWindowStage.setTitle("Transportes Uptc/createUserWindow");
            loginWindowStage.setScene(scene);
            loginWindowStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeWindow(MouseEvent mouseEvent) {
        Scene scene = ((Node) mouseEvent.getSource()).getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }

    //El boton acerca del programa en el menu bar
    public void showAbouthTheProgram(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca de Transportes Uptc 1.0.0");
        alert.setHeaderText("Product Version \n" +
                "Transportes Uptc 1.0.0 \n" +
                "\n" +
                "Build Information \n" +
                "Version 1.0.0 \n" +
                "Date: 2024-03-13 \n" +
                "JavaFX Version: 21\n" +
                "Java Version: 21, OpenJDK Runtime Environment\n");
        alert.showAndWait();
    }

    //El boton support del programa en el menu bar
    public void showSupport(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Transportes Uptc 1.0.0");
        alert.setHeaderText("¡Para cualquier eventualidad comuniquese con soporte! \n" +
                "Canales de comunicaion: \n" +
                "\n" +
                "cristian.galindo05@uptc.edu.co \n" +
                "GitHub: Cristian13Galindo \n" +
                "Linkedin: www.linkedin.com/in/cristian-camilo-galindo-suárez-90049b24b \n" +
                "\n" +
                "Esperamos tu comunicacón :=) \n" +
                "Equipo de desarrollo de Transportes Uptc\n");
        alert.showAndWait();
    }

    //Boton salir desde el menubar
    public void closeProgram(ActionEvent actionEvent) {
        Platform.exit();
    }
}
