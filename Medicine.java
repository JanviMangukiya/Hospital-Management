public class Medicine {
    private int id;
    private String name;
    private double price;

    public Medicine(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medicine [ID: " + id + ", Name: " + name + ", Price: $" + price + "]";
    }
}
