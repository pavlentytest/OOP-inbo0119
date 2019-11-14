package ru.samsungitacademy;

public class MiniToster extends Toster  {

    private String bbb;

    // метод переопределен
    // override

    public void heatAir() { // <- сигнатура метода
        int a = 100;
        int b = 200;
        System.out.println("no heat!!!!");
    }

}
