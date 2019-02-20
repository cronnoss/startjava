/*
*Java. My programm If,else
*@version dated 14 Feb, 2019
*@autor Evgenii Karasev
*@mail karasevevg@gmail.com
**/

public class ConditionalStatement {

    public static void main(String[] args) {
        //TODO: условия с помощью языка Java
        /*
        ЕСЛИ(вашВозраст > 20) {
        выведите какое-то сообщение
        }

        ЕСЛИ(выМужскогоПола) {
            выведите какое-то сообщение
        }

        ЕСЛИ(выЖенскогоПола) {
            выведите какое-то сообщение
        }

        ЕСЛИ(вашРос < 1.80) {
            выведите какое-то сообщение
        } ИНАЧЕ {
            выведите какое-то сообщение
        }

        ЕСЛИ(ВашеИмяНачинаетсяСБуквыМ == ‘М’) {
            выведите какое-то сообщение
        } ИНАЧЕ ЕСЛИ(ВашеИмяНачинаетсяСБуквыИ == ‘И’) {
            выведите какое-то сообщение
        } ИНАЧЕ {
            выведите какое-то сообщение
        } 
        **/

        int age = 46;
        boolean isAge = age > 20;
        if(isAge == true){
            System.out.println("Вы старше 20 лет. Ваш возраст = " + age);
        }
        char pol = 'm';
        boolean isPol = pol == 'm';
        if(isPol == true){
            System.out.println("Ваш пол - мужской");
        }
        char pol1 = 'f';
        boolean isPol1 = pol1 == 'f';
        if(isPol1 == true){
            System.out.println("Ваш пол - женский");
        }
        float height = 1.72f;
        boolean isHeight = height < 1.80;
        if(isHeight == true){
            System.out.println("Ваш рост меньше 1 метр 80 см. Ваш рост = " + height);
        } else if(isHeight == false){
            System.out.println("Ваш рост больше 1 метр 80 см. Ваш рост = " + height);
            }
        char name = 'М';
        boolean isName = name == 'М';
        boolean isName1 = name == 'И';
        if(isName == true){
            System.out.println("Ваше имя начинается на букву М");
        } else if(isName1 == true){
            System.out.println("Ваше имя начинается на букву И");
        } else {
            System.out.println("Ваше имя начинается не на букву М, и не на букву И");
        }
    }
}