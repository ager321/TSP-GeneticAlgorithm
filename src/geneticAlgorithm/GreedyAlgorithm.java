package geneticAlgorithm;

import java.util.ArrayList;

public class GreedyAlgorithm extends TSPSolver {
    public GreedyAlgorithm(String inFilePath, String outFilePath) {
        super(inFilePath, outFilePath);
    }
    public SolutionProperties solve()
    {
        ArrayList<City> listOfCities= problem.getCitylist();
        Individual individual = new Individual();
        double bestSolution, individual_value;
        int numberOfCities = problem.getCitiesCount();

        individual.getGenome().add(1);
        for(int i = 1; i < numberOfCities; i++)
        {
            City currentCity = listOfCities.get(individual.getGenome().get(i-1)-1);
            individual.getGenome().add(findNearestCity(currentCity, individual).id);
        }
        individual_value = evaluateIndividual(individual);
        bestSolution = individual_value;
        individual = new Individual();


        for (int j=1; j < numberOfCities; j++)
        {
            individual.getGenome().add(j+1);
            for(int i = 1; i < numberOfCities; i++)
            {
                City currentCity = listOfCities.get(individual.getGenome().get(i-1)-1);
                individual.getGenome().add(findNearestCity(currentCity, individual).id);
            }
            individual_value = evaluateIndividual(individual);
            if(individual_value < bestSolution)
            {
                bestSolution = individual_value;
            }
            individual = new Individual();
        }
    //wypadaloby przetestowac
        return new SolutionProperties(bestSolution);
    }

    City findNearestCity(City city, Individual individual)
    {
        int numberOfCities = problem.getCitiesCount();
        ArrayList<City> listOfCities= problem.getCitylist();
        double smallestDistance = -1;
        City nearestCity = city;



        for(int i = 0; i < numberOfCities; i++)
        {
            if(city.id-1 != i && !individual.getGenome().contains(listOfCities.get(i).id))
            {
                double currentCityDistance = citiesDistance(city, problem.getCitylist().get(i));
                if(smallestDistance > currentCityDistance || smallestDistance == -1)
                {
                    smallestDistance = currentCityDistance;
                    nearestCity = listOfCities.get(i);
                }

            }
        }
        return nearestCity;
    }
}
