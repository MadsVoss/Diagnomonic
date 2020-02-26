import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIController {

    public void controller (final Stage stage ) {

    }

    public void patientVindue(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/patientGUI.fxml"));
        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void lægeVindue(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/lægeGUI.fxml"));
        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void sundhedsprofessionelVindue(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sundhedsprofessionelGUI.fxml"));
        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void tilbageVindue(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui.fxml"));
        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
