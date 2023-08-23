package Model;

public class Toy {

    private int id;
    private String name;
    private int count;
    private Double dropRate;

    private static int next_id = 0;

    public Toy() {
    }

    public Toy(String name, int count, Double dropRate) {
        this.id = ++Toy.next_id;
        this.name = name;
        this.count = count;
        this.dropRate = dropRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getDropRate() {
        return dropRate;
    }

    public void setDropRate(Double dropRate) {
        this.dropRate = dropRate;
    }

    @Override
    public String toString() {
        return id + ". " + name + ", " + count + ", " + dropRate;
    }

    public static int getNext_id() {
        return next_id;
    }

    public static void reduceNext_id() {
        next_id--;
    }

}
