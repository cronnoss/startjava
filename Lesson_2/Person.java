/*TODO: Создайте класс Person
- Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
- Проинициализируйте их какими-то значениями
- Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
*/
public class Person {

    char gender = 'm';
    String name = "Evgeniy";
    float height = 1.72f;
    int weight = 75;
    int age = 46;

    void move() {
        System.out.println("Вы прошли 10 шагов");    
    }

    boolean sit() {
        System.out.println("Вы сели на стул");
        return false;    
    }

    void run() {
        System.out.println("Вы пробежали 20 метров");    
    }
    
    String speak() {
        System.out.println("Меня зовут Евгений");    
        return "right";
    }
    
    boolean learnJava() {
        System.out.println("Я учу java");    
        return true;
    }
}