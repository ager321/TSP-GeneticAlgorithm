package geneticAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Individual {

    private ArrayList<Integer> genome;
    Individual()
    {
        genome = new ArrayList<>();
    }

    Individual(int numberOfCities)
    {
        genome = new ArrayList<>(numberOfCities);
        for(int i=1; i <= numberOfCities; i++)
        {
            genome.add(i);
        }
        randomizeGenome();
    }
    public void randomizeGenome()
    {
        Collections.shuffle(genome);
    }

    public int getGene(int position)
    {
        return genome.get(position);
    }
    public ArrayList<Integer> getGenome() {
        return genome;
    }
    @Override
    public String toString() {
        return "Individual{" +
                "genome=" + genome +
                '}';
    }

}
