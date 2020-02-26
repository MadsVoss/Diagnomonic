import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class GUI extends Application {

    @Override
    public void start(final Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui.fxml"));
        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();


    }
}


        /*


        // DETTE ER TIL FORSIDEN
        final Label labelDiagnomonic = new Label("Diagnomonic");
        final Button buttonP = new Button("Patient");
        final Button buttonL = new Button("Læge");
        final Button buttonSP = new Button("Sundhedsprofessionel");
        final Button buttonTilbage = new Button("Tilbage");
        // HER ER FORSIDEN
        GridPane pane = new GridPane();
        pane.add(labelDiagnomonic, 0 ,0 );
        pane.add(buttonP,3,13); //Row -> //column ^
        pane.add(buttonL, 1, 14);
        pane.add(buttonSP,5, 14);


        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();

        //DETTE ER TIL PATIENT KNAPPEN
        buttonP.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    Label labelCPR = new Label("CPR-nr:");
                    TextField textCPR = new TextField ();
                    Button button2 = new Button("Login");



                    GridPane pane2 = new GridPane();
                    pane2.add(labelDiagnomonic,0,0);
                    pane2.add(labelCPR, 1, 1);
                    pane2.add(textCPR, 2, 1);
                    pane2.add(button2, 1 ,2 );
                    pane2.add(buttonTilbage, 0, 1);

                    Scene scene2 = new Scene(pane2, 640, 480);
                    stage.setScene(scene2);
                    stage.show();
                }
        });

        //DETTE ER TIL LÆGE KNAPPEN
        buttonL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Label labelBrugernavn = new Label("Brugernavn:");
                TextField textBrugernavn = new TextField ();
                Label labelPassword = new Label ("Password:");
                TextField textPassword = new TextField ();
                Button button2 = new Button("Login");



                GridPane pane2 = new GridPane();
                pane2.add(labelDiagnomonic, 0,0);
                pane2.add(labelBrugernavn, 1, 1);
                pane2.add(textBrugernavn, 2, 1);
                pane2.add(labelPassword, 1, 2);
                pane2.add(textPassword, 2,2);
                pane2.add(button2, 1 ,3 );
                pane2.add(buttonTilbage, 0, 1);
                //pane2.setGridLinesVisible(true);

                Scene scene2 = new Scene(pane2, 640, 480);
                stage.setScene(scene2);
                stage.show();
            }
        });

        //DETTE ER TIL SUNDHEDSPROFESSIONELLE KNAPPEN
        buttonSP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                Label labelBrugernavn = new Label("Brugernavn:");
                TextField textBrugernavn = new TextField ();
                Label labelPassword = new Label ("Password:");
                TextField textPassword = new TextField ();
                Button button2 = new Button("Login");


                GridPane pane2 = new GridPane();
                pane2.add(labelDiagnomonic, 0,0);
                pane2.add(labelBrugernavn, 1, 1);
                pane2.add(textBrugernavn, 2, 1);
                pane2.add(labelPassword, 1, 2);
                pane2.add(textPassword, 2,2);
                pane2.add(button2, 1 ,3 );
                pane2.add(buttonTilbage, 0, 1);
                //pane2.setGridLinesVisible(true);

                Scene scene2 = new Scene(pane2, 640, 480);
                stage.setScene(scene2);
                stage.show();
            }
        });

        //DETTE ER TIL TILBAGE KNAPPEN

        buttonTilbage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                GridPane pane = new GridPane();

                pane.add(labelDiagnomonic, 0 ,0 );
                pane.add(buttonP,3,13); //Row -> //column ^
                pane.add(buttonL, 1, 14);
                pane.add(buttonSP,5, 14);

                Scene scene = new Scene(pane, 640, 480);
                stage.setScene(scene);
                stage.show();

            }
        });



    }

}


*/