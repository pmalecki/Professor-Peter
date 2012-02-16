/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.peter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pmalecki
 */
public class ProfessorPeter extends Application {
    
    public static void main(String[] args) {
        Application.launch(ProfessorPeter.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        
        stage.setScene(new Scene(root));
        stage.show();
    }
}
