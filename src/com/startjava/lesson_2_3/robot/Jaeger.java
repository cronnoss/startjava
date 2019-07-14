package com.startjava.lesson_2_3.robot;

public class Jaeger {

    // поля:
    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private int speed;

    // конструктор для инициализации полей объекта, который будет создан и будет относиться к типу Jaeger:
    public Jaeger(String modelName, String mark, String origin, float weight, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight;
        this.speed = speed;
    }

    // геттеры и сеттеры для доступа к полям :
    public String getModelName() {
        return modelName;
    } 
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    } 
    
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    } 
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    } 
    
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    } 
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // методы:
    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;    
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");    
    }
    
    public String scanKaiju() {
        return "nothing";
    }
}