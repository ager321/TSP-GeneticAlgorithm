package geneticAlgorithm;

public class SolutionProperties {
    private double evaluated_solution;
    private double time;
    private double average;
    private double std;

    public SolutionProperties(double evaluated_solution) {
        this.evaluated_solution = evaluated_solution;
    }

    public SolutionProperties(double evaluated_solution, double time, double average, double std) {
        this.evaluated_solution = evaluated_solution;
        this.time = time;
        this.average = average;
        this.std = std;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getStd() {
        return std;
    }

    public void setStd(double std) {
        this.std = std;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }



    public double getEvaluated_solution() {
        return evaluated_solution;
    }

    public void setEvaluated_solution(double evaluated_solution) {
        this.evaluated_solution = evaluated_solution;
    }
}
