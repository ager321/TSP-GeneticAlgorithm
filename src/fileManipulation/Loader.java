package fileManipulation;

import geneticAlgorithm.City;
import geneticAlgorithm.TSPProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader {
    private TSPProblem problem;

    public Loader()
    {
        problem = new TSPProblem();
    }

    public TSPProblem getProblem() {
        return problem;
    }

    public TSPProblem read(String filename) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scan != null) {
            while (scan.hasNext()) {
                String line = scan.nextLine();
                String[] splitLine = line.replaceAll("\\s+", " ").trim().split(" ");

                if (splitLine.length == 3) {
                    try {
                        int id = Integer.parseInt(splitLine[0]);

                        double x = Double.parseDouble(splitLine[1]);
                        double y = Double.parseDouble(splitLine[2]);
                        problem.addCity(new City(id, x, y));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return problem;
    }


}
