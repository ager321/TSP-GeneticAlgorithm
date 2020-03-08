package userInterface;

import geneticAlgorithm.SolutionProperties;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class GreedyResultController {

    public Button button_back_choice;
    public Button back_to_random_button;
    public Label best_cost;

    public void backToChoice(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) button_back_choice.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../resources/main_menu.fxml"));
        stage.setTitle("Traveling salesman problem");
        stage.setScene(new Scene(root, 600, 300));
        stage.show();
    }

    public void backToRandom(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back_to_random_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../resources/greedy_menu.fxml"));
        stage.setTitle("Traveling salesman problem");
        stage.setScene(new Scene(root, 600, 300));
        stage.show();
    }

    public void setResult(SolutionProperties solution)
    {
        best_cost.setText(Double.toString(solution.getEvaluated_solution()));
    }
}
