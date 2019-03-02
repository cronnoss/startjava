public class Jaeger {

    // поля:
    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private int speed;

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