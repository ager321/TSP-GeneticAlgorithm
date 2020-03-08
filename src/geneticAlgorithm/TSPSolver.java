package geneticAlgorithm;

import fileManipulation.Loader;
import fileManipulation.Saver;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;


public abstract class TSPSolver {
    private Saver saver;
    TSPProblem problem;
    String in_file_path;
    String out_file_path;


    public TSPSolver(String inFilePath, String outFilePath){
        in_file_path = inFilePath;
        out_file_path = outFilePath;
        Loader loader = new Loader();
        saver = new Saver();
        problem = loader.read(in_file_path);
    }

    public abstract SolutionProperties solve();

    public double evaluateIndividual(Individual individual)
    {
        int numberOfCities = problem.getCitylist().size(), city1, city2=1;
        double length = 0;
        for(int i = 0; i < numberOfCities-1; i++)
        {
            city1 = individual.getGene(i);
            city2 = individual.getGene(i+1);
            length += citiesDistance(problem.getCitylist().get(city1-1), problem.getCitylist().get(city2-1));
        }
        length += citiesDistance(problem.getCitylist().get(city2-1), problem.getCitylist().get(individual.getGene(0)-1));
        return length;
    }
    protected double citiesDistance(City city1, City city2)
    {
        return Math.sqrt((city2.x-city1.x)*(city2.x-city1.x) + (city2.y-city1.y)*(city2.y-city1.y));
    }
}
