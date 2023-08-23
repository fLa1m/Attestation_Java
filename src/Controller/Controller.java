package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import Model.Toy;
import Service.ShopService;

public class Controller {
    private final ShopService service = new ShopService();

    public void addToy(String name, int count, Double dropRate) {
        service.add(name, count, dropRate);
    }

    public void showShop() {
        for (Toy toy : service.getShopList()) {
            System.out.println(toy.toString());
        }
    }

    public void changeRate(int id, double rate) {
        for (Toy toy : service.getShopList()) {
            if (toy.getId() == id) {
                toy.setDropRate(rate);
            }
        }
    }

    public void lottery() {
        for (Toy toy : service.getShopList()) {
            double rand = Math.random();
            if (toy.getCount() > 0 && rand <= toy.getDropRate()) {
                service.getPrizeList().add(toy.getName());
                toy.setCount(toy.getCount() - 1);
            }
        }
    }

    public void showLottery() {
        for (String toy : service.getPrizeList()) {
            System.out.println(toy.toString());
        }
    }

    public void getPrize() {
        String path = "prize_toy.txt";
        if (service.getPrizeList().isEmpty()) {
            System.out.println("Призовых игрушек нет.");
        } else {
            try {
                FileWriter writer = new FileWriter(path, Charset.forName("UTF-8"), true);
                writer.write(service.getPrizeList().remove());
                writer.write("\n");
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
