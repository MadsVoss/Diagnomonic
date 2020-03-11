import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class GUIController {


    public TextField patientTekst;
    public TextField lægeBrugernavn;
    public PasswordField lægePassword;
    public PasswordField passwordSP;
    public TextField brugernavnSP;



    public void patientVindue(ActionEvent actionEvent) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/patientGUI.fxml"));
           GridPane gridPane = loader.load();
           Scene scene = new Scene(gridPane);
           GUI.stage.setScene(scene);
       }

       public void lægeVindue(ActionEvent actionEvent) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/lægeGUI.fxml"));
           GridPane gridPane = loader.load();
           Scene scene = new Scene(gridPane);
           GUI.stage.setScene(scene);
       }

       public void sundhedsprofessionelVindue(ActionEvent actionEvent) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/sundhedsprofessionelGUI.fxml"));
           GridPane gridPane = loader.load();
           Scene scene = new Scene(gridPane);
           GUI.stage.setScene(scene);
       }

       public void tilbageVindue(ActionEvent actionEvent) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui.fxml"));
           GridPane gridPane = loader.load();
           Scene scene = new Scene(gridPane);
           GUI.stage.setScene(scene);
       }

       public void loginPatient(ActionEvent actionEvent) throws IOException {
           String[] cprArray = new String[3];
           cprArray[0] = "1902961234";
           cprArray[1] = "2209971337";
           cprArray[2] = "4206969420";
           for (int i = 0; i < cprArray.length; i++) {
               if (cprArray[i].equals(patientTekst.getText())) {
                   FXMLLoader loader = new FXMLLoader(getClass().getResource("/loginPatientGUI.fxml"));
                   GridPane gridPane = loader.load();
                   Scene scene = new Scene(gridPane);
                   GUI.stage.setScene(scene);
               }
           } if (!cprArray.equals(patientTekst.getText())) {
               patientTekst.setText("Prøv igen");
           }
    }

    public void rødtFelt(MouseEvent actionEvent) {
        patientTekst.setText("");
    }

    public void loginLæge(ActionEvent actionEvent) {
        String[] brugernavnLæge = new String[1];
        brugernavnLæge[0] = "Admin";
        String[] passwordLæge = new String[1];
        passwordLæge[0] = "Admin";

        for (int i = 0; i < brugernavnLæge.length; i++) {
            if (brugernavnLæge[i].equals(lægeBrugernavn.getText()) && passwordLæge[i].equals(lægePassword.getText())) {
                System.out.println("login");
            } else if (!brugernavnLæge[i].equals(lægeBrugernavn.getText())){
                lægeBrugernavn.setText("Prøv igen");
            } else if (!passwordLæge[i].equals(lægePassword.getText())) {
                //lægePassword.setText("Prøv igen");
                System.out.println("Forkert password");
            }
        }
    }

    public void loginSP(ActionEvent actionEvent) {
        String[] spBrugernavn = new String[1];
        spBrugernavn[0] = "Admin";
        String[] spPassword = new String[1];
        spPassword[0] = "Admin";

        for (int i = 0; i < spBrugernavn.length; i++) {
            if (spBrugernavn[i].equals(brugernavnSP.getText()) && spPassword[i].equals(passwordSP.getText())) {
                System.out.println("login");
            } else if (!spBrugernavn[i].equals(brugernavnSP.getText())){
                lægeBrugernavn.setText("Prøv igen");
            } else if (!spPassword[i].equals(passwordSP.getText())) {
                System.out.println("Forkert password");
            }
        }
    }

    public void visTemperatur(ActionEvent actionEvent) throws InterruptedException {
        double random = Math.random();
        double temperatur = 36.0;
        //while(true) {
          //  Thread.sleep(1000);
            if(random < 1.5 ) {
                System.out.println("Patientens temperatur er: " + String.format("%.1f", temperatur + random) + "°C");
            }
        }

    }




