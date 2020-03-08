package geneticAlgorithm;

public class RandomSolver extends TSPSolver {
    private int number_of_tries;
    public RandomSolver(String inFilePath, String outFilePath, int numberOfTries) {
        super(inFilePath, outFilePath);
        number_of_tries = numberOfTries;
    }
    public SolutionProperties solve()
    {
        Individual random_individual = new Individual(problem.getCitiesCount());
        double bestSolution = evaluateIndividual(random_individual), individual_value;
        for(int i =0; i<number_of_tries-1; i++)
        {
            individual_value = evaluateIndividual(random_individual);
            if(bestSolution > individual_value)
            {
                bestSolution = individual_value;
            }
            random_individual.randomizeGenome();
        }

        return new SolutionProperties(bestSolution);
    }
    public void setNumber_of_tries(int number_of_tries) {
        this.number_of_tries = number_of_tries;
    }
}
