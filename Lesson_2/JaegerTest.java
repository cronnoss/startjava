public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        
        //присваивание значений полям объекта wolfOne с помощью сеттеров:
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);

        jaegerTwo.setModelName("Cherno Alpha");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("Russia");
        jaegerTwo.setWeight(2.412f);
        jaegerTwo.setSpeed(3);

        //считывание значений полей объекта с помощью геттеров:
        System.out.println("Jaeger's name is " + jaegerOne.getModelName());
        System.out.println("Jaeger's mark is " + jaegerOne.getMark());
        System.out.println("Jaeger's origin is " + jaegerOne.getOrigin());
        System.out.println("Jaeger's weight is " + jaegerOne.getWeight());
        System.out.println("Jaeger's speed is " + jaegerOne.getSpeed());

        System.out.println("Jaeger's name is " + jaegerTwo.getModelName());
        System.out.println("Jaeger's mark is " + jaegerTwo.getMark());
        System.out.println("Jaeger's origin is " + jaegerTwo.getOrigin());
        System.out.println("Jaeger's weight is " + jaegerTwo.getWeight());
        System.out.println("Jaeger's speed is " + jaegerTwo.getSpeed());

        // перезаписывание и вывод значения полей
        jaegerOne.setMark("java");
        System.out.println("Jaeger's mark is " + jaegerOne.getMark());
        jaegerOne.setSpeed(700);
        System.out.println("Jaeger's speed is " + jaegerOne.getSpeed());

        jaegerTwo.setOrigin("It's modified!");
        System.out.println("Jaeger's origin is " + jaegerTwo.getOrigin());
        jaegerTwo.setWeight(0.001f);
        System.out.println("Jaeger's weight is " + jaegerTwo.getWeight());

        //вызов метода объекта:
        jaegerOne.drift();
        jaegerOne.move();
        System.out.println(jaegerOne.scanKaiju());
    }
}