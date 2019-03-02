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
public class Wolf {

    // поля:
    private char gender;
    private String name;
    private int weight; 
    private int age;
    private String color;

    // геттеры и сеттеры для доступа к полям:
    public char getGender() {
        return gender;
    } 
    
    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getName() {
        return name;
    } 
   
    public void setName(String name) {
        this.name = name;
    }


    public int getWeight() {
        return weight;
    } 
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    } 

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    } 

    public void setColor(String color) {
        this.color = color;
}

    // методы:
    public void move() {
        
    }

    public boolean sit() {
        return false;    
    }

    public void run() {
        
    }

    public void yawl() {
        
    }
    
    public String hunt() {
        return "Hurray!";
    }
}