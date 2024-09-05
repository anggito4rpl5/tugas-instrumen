package Latihan;

/**
 * Latihan2
 */
public class Instrumen {

    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // constructor parameter
    public Instrumen(String i, double p) {
        type = i;
        price = p;

    }

    public Instrumen() {
        // 
    }

    public void print() {
        System.out.println("lebokno tipe ne = " + type);
        System.out.println("lebokno hargane = " + price);
    }
}













