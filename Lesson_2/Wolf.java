/*TODO: Создайте класс Wolf
- напишите в нем поля: пол, кличка, вес, возраст, окрас
- напишите в нем методы: идти, сидеть, бежать, выть, охотиться
- Создайте класс WolfTest с методом main
- создайте объект типа Wolf
- присвойте в нем полям экземпляра класса Wolf какие-то значения
- считайте эти значения из полей и отобразите в консоли
- вызовите методы объекта
*/

public class Wolf {

    char gender;
    String name;
    int weight;
    int age;
    String color;

    void move() {
        
    }

    boolean sit() {
        return false;    
    }

    void run() {
        
    }

    void yawl() {
        
    }
    
    String hunt() {
        return "Hurray!";
    }
}