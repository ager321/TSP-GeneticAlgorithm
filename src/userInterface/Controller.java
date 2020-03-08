package userInterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.io.IOException;

public class Controller {
    @FXML
    public Button random_button;
    public Button greedy_button;
    public Button genetic_button;

    public void OnRandomChosen(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) random_button.getScene().getWindow();
        Stage randomAlgStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("../resources/random_alg_menu.fxml"));
        randomAlgStage.setScene(new Scene(root, 600, 300));
        randomAlgStage.show();
    }

    public void OnGreedyChosen(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) random_button.getScene().getWindow();
        Stage randomAlgStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("../resources/greedy_menu.fxml"));
        randomAlgStage.setScene(new Scene(root, 600, 300));
        randomAlgStage.show();
    }

    public void OnGeneticChosen(ActionEvent actionEvent) {
    }
}
