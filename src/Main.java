import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addToy("Мягкая игрушка", 2, 0.7);
        controller.addToy("Машинка на раидоуправлении", 3, 0.3);
        controller.addToy("Кукла Barbie", 2, 0.5);
        controller.showShop();
        controller.changeRate(2, 0.4);
        System.out.println();
        System.out.println("Изменили шанс выпадения у машинок.");
        controller.showShop();
        System.out.println();
        System.out.println("Запускаем лоттерею и получаем список призовых игрушек.");
        controller.lottery();
        controller.showLottery();
        System.out.println();
        System.out.println("Остаток игрушек в магазине.");
        controller.showShop();
        System.out.println();
        controller.getPrize();
        controller.getPrize();
        controller.getPrize();
    }
}
