package userInterface;

import geneticAlgorithm.RandomSolver;
import geneticAlgorithm.SolutionProperties;
import geneticAlgorithm.TSPProblem;
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

public class RandomAlgMenuController {

    @FXML
    public Button start_button;
    public ChoiceBox pathchoice;
    public TextField number_of_tries;

    public void startSimulation(ActionEvent actionEvent) throws IOException {
        String path = "TSP/" +  pathchoice.getValue() + ".tsp";
        int number_of_rand;

        try {
            number_of_rand = Integer.parseInt(number_of_tries.getText());
        }catch (NumberFormatException e)
        {
            number_of_rand = 100;
        }


        TSPSolver solver = new RandomSolver(path, "", number_of_rand);
        SolutionProperties solution = solver.solve();


        Stage stage = (Stage) start_button.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/random_result.fxml"));
        Parent root = loader.load();
        RandomResultController resultController = (RandomResultController)loader.getController();

        resultController.setResult(solution);
        stage.setTitle("Traveling salesman problem");
        stage.setScene(new Scene(root, 600, 300));
        stage.show();


    }



    public void OnRandomChosen(ActionEvent actionEvent) throws IOException {

    }
}
