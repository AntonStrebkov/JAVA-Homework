public class Laptop {
    private String model; // модель
    private int ram; // оперативная память
    private int hdd; // жеский диск
    private int cost; // стоимость
    private String color; // цвет

    public Laptop(String model, String color, int ram, int hdd) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("model: %s color: %s RAM: %d HDD:%d\n", model, color, ram, hdd);
    }
}
//String.format(format: "%s %s %d %d", model, color, ram, hdd);


