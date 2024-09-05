package Latihan;

import java.util.Scanner;

public class PlayInstrumen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Instrumen a = new Instrumen();
        Instrumen b = new Instrumen("Piano", 200.0);
        Instrumen c = new Instrumen("Violin", 150.0);

        a.setType("Guitar");
        a.setPrice(101.5);

        a.print();
        b.print();
        c.print();

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("instrumen termahal adalah " + a.getType());
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("insstrumen termahal adalah " + b.getType() );
        } else {
            System.out.println("Instrumen termahal adalah " + c.getType());
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("instrumen termurah adalah " + a.getType());
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("insstrumen termurah adalah " + b.getType());
        } else {
            System.out.println("Instrumen termurah adalah " + c.getType());
        }

    }

}
