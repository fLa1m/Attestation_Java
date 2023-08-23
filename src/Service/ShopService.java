package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Model.Toy;

public class ShopService {

    private List<Toy> shopList = new ArrayList<>();
    private Queue<String> prizeList = new LinkedList<>();

    public void add(String name, int count, Double dropRate) {
        boolean flag = true;
        Toy toy = new Toy(name, count, dropRate);
        if (shopList.isEmpty()) {
            shopList.add(toy);
        } else {
            for (Toy elToy : shopList) {
                if (elToy.getName().equals(toy.getName())) {
                    elToy.setCount(elToy.getCount() + toy.getCount());
                    flag = false;
                    Toy.reduceNext_id();
                    break;
                }
            }
            if (flag) {
                shopList.add(toy);
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(shopList.toArray()).replace("[", "").replace("]", "");
    }

    public List<Toy> getShopList() {
        return shopList;
    }

    public Queue<String> getPrizeList() {
        return prizeList;
    }

}
