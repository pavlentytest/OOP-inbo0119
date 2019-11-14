package ru.samsungitacademy;

public class Main {

    public static void main(String[] args) {

        int a;
        //System.out.println(a);
        Toster philips = new Toster();
       philips.makeTost();
        philips.setColor("red");
        System.out.println(philips.getColor());

        Toster samsung = new Toster("","blue",3,4);
        samsung.makeTost();
        System.out.println(samsung.getColor());
       // Toster bosh = new Toster();
       // bosh.makeTost();

        MiniToster mini = new MiniToster();
        mini.heatAir();

    }
}
