package Model;

import java.util.List;

public class Shop {

    private List<Toy> toysList;

    public Shop() {
    }

    public Shop(List<Toy> toysList) {
        this.toysList = toysList;
    }

    public List<Toy> getToysList() {
        return toysList;
    }

    public void setToysList(List<Toy> toysList) {
        this.toysList = toysList;
    }

}
