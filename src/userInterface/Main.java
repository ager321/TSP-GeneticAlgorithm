package userInterface;

import geneticAlgorithm.RandomSolver;
import geneticAlgorithm.TSPSolver;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../resources/main_menu.fxml"));
        primaryStage.setTitle("Traveling salesman problem");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //TSPSolver solver = new RandomSolver("TSP/berlin11_modified.tsp","", 10000);
        //TSPSolver solver = new RandomSolver("TSP/ali535.tsp","", 10000);
        TSPSolver solver = new RandomSolver("TSP/pr2392.tsp","", 10000);
        //TSPSolver solver = new GreedyAlgorithm("TSP/berlin11_modified.tsp","");
        System.out.println(solver.solve());
        launch(args);
    }
}
