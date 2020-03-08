package geneticAlgorithm;

import java.util.ArrayList;

public class TSPProblem {
    private ArrayList<City> citylist = new ArrayList<City>();

    public int getCitiesCount() {
        return citylist.size();
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    public void addCity(City city) {
        citylist.add(city);
    }

    @Override
    public String toString() {
        return "TSPProblem{" +
                "citylist=" + citylist +
                '}';
    }
}
