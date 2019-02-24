/*TODO: Создайте класс Wolf
- напишите в нем поля: пол, кличка, вес, возраст, окрас
- напишите в нем методы: идти, сидеть, бежать, выть, охотиться
- Создайте класс WolfTest с методом main
- создайте объект типа Wolf
- присвойте в нем полям экземпляра класса Wolf какие-то значения
- считайте эти значения из полей и отобразите в консоли
- вызовите методы объекта
*/
public class WolfTest {

    public static void main(String[] agrs) {
        Wolf wolfOne = new Wolf();
        
        wolfOne.gender = 'm';
        wolfOne.name = "Rex";
        wolfOne.weight = 30;
        wolfOne.age = 5;
        wolfOne.color = "gray";

        System.out.println("Wolf's nickname is " + wolfOne.name);
        System.out.println("Wolf's gender is " + wolfOne.gender);
        System.out.println("Wolf's weight is " + wolfOne.weight);
        System.out.println("Wolf's age is " + wolfOne.age);
        System.out.println("Wolf's color is " + wolfOne.color);

        wolfOne.move();
        System.out.println(wolfOne.sit());
        wolfOne.run();
        wolfOne.yawl();
        System.out.println(wolfOne.hunt());
    }
}