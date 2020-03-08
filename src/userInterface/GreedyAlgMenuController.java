package userInterface;

import geneticAlgorithm.GreedyAlgorithm;
import geneticAlgorithm.RandomSolver;
import geneticAlgorithm.SolutionProperties;
import geneticAlgorithm.TSPSolver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GreedyAlgMenuController {

    @FXML
    public Button start_button;
    public ChoiceBox pathchoice;


    public void startSimulation(ActionEvent actionEvent) throws IOException {
        String path = "TSP/" +  pathchoice.getValue() + ".tsp";

        TSPSolver solver = new GreedyAlgorithm(path, "");
        SolutionProperties solution = solver.solve();

        System.out.println(solution.getEvaluated_solution());
        Stage stage = (Stage) start_button.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/greedy_result.fxml"));
        Parent root = loader.load();
        GreedyResultController resultController = (GreedyResultController)loader.getController();

        resultController.setResult(solution);
        stage.setScene(new Scene(root, 600, 300));
        stage.show();


    }



    public void OnRandomChosen(ActionEvent actionEvent) throws IOException {

    }
}
