package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        // создание 1-го экземпляра класса Jaeger с помощью конструктора, находящегося в классе Jaeger:
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 1.980f, 7);

        // считывание значений полей объекта с помощью геттеров:
        System.out.println("Jaeger's name is " + gipsyDanger.getModelName());
        System.out.println("Jaeger's mark is " + gipsyDanger.getMark());
        System.out.println("Jaeger's origin is " + gipsyDanger.getOrigin());
        System.out.println("Jaeger's weight is " + gipsyDanger.getWeight());
        System.out.println("Jaeger's speed is " + gipsyDanger.getSpeed());

        // перезаписывание и вывод значения полей
        gipsyDanger.setMark("java");
        System.out.println("Jaeger's mark is " + gipsyDanger.getMark());
        gipsyDanger.setSpeed(700);
        System.out.println("Jaeger's speed is " + gipsyDanger.getSpeed());

        // вызов метода объекта:
        gipsyDanger.drift();
        gipsyDanger.move();
        System.out.println(gipsyDanger.scanKaiju());
        
        
        // создание 2-го экземпляра класса Jaeger с помощью конструктора, находящегося в классе Jaeger:
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 2.412f, 3);

        // считывание значений полей объекта с помощью геттеров:
        System.out.println("Jaeger's name is " + chernoAlpha.getModelName());
        System.out.println("Jaeger's mark is " + chernoAlpha.getMark());
        System.out.println("Jaeger's origin is " + chernoAlpha.getOrigin());
        System.out.println("Jaeger's weight is " + chernoAlpha.getWeight());
        System.out.println("Jaeger's speed is " + chernoAlpha.getSpeed());

        // перезаписывание и вывод значения полей
        chernoAlpha.setOrigin("It's modified!");
        System.out.println("Jaeger's origin is " + chernoAlpha.getOrigin());
        chernoAlpha.setWeight(0.001f);
        System.out.println("Jaeger's weight is " + chernoAlpha.getWeight());

        // вызов метода объекта:
        chernoAlpha.drift();
        chernoAlpha.move();
        System.out.println(chernoAlpha.scanKaiju());
    }
}