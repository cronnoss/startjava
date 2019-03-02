/*TODO: Создайте класс Wolf
- напишите в нем поля: пол, кличка, вес, возраст, окрас
- напишите в нем методы: идти, сидеть, бежать, выть, охотиться
- Создайте класс WolfTest с методом main
- создайте объект типа Wolf
- присвойте в нем полям экземпляра класса Wolf какие-то значения
- считайте эти значения из полей и отобразите в консоли
- вызовите методы объекта
/*TODO: Модифицируйте класс Wolf
- у всех полей класса напишите модификатор доступа private
- у всех методов класса напишите модификатор доступа public
- для доступа к полям создайте геттеры и сеттеры
- в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст"
/*TODO: Модифицируйте класс WolfTest
- с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
- считайте эти значения из полей с помощью геттеров и отобразите в консоли.
*/
public class WolfTest {

    public static void main(String[] agrs) {
        Wolf wolfOne = new Wolf();

        //присваивание значений полям объекта wolfOne с помощью сеттеров:
        wolfOne.setGender('m');
        wolfOne.setName("Rex");
        wolfOne.setWeight(80);
        wolfOne.setAge(8);
        wolfOne.setColor("gray");

        //считывание значений полей объекта с помощью геттеров:
        System.out.println("Wolf's nickname is " + wolfOne.getName());
        System.out.println("Wolf's gender is " + wolfOne.getGender());
        System.out.println("Wolf's weight is " + wolfOne.getWeight());
        System.out.println("Wolf's age is " + wolfOne.getAge());
        System.out.println("Wolf's color is " + wolfOne.getColor());

        //вызов метода объекта:
        wolfOne.move();
        System.out.println(wolfOne.sit());
        wolfOne.run();
        wolfOne.yawl();
        System.out.println(wolfOne.hunt());
    }
}