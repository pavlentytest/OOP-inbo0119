package ru.samsungitacademy;

public class Toster {

    // характ-и - ПОЛЯ класса
    private String brand; // null
    private String color;  // null
    private double temp; // 0.0
    private int power; // 0

    // Конструктор - перегружен
    // overload

    Toster() {

    }

    Toster(String b, String c, double t, int p) {
        this.brand = b;
        this.color = c;
        this.power = p;
        this.temp = t;
    }


    public void setColor(String c)  {
        // логику проверки и т.п.
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    // действия - методы
    public void heatAir() { // <- сигнатура
        System.out.println("heat!!!");
    }

    public void makeTost() {

    }


}
