/*
*Java. My programm If,else
*@version dated 21 Feb, 2019
*@autor Evgenii Karasev
//TODO: условия с помощью языка Java
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
*/
public class ConditionalStatement {
    public static void main(String[] args) {
        
        int age = 46;
        boolean isAge = age > 20;
        if(isAge) {
            System.out.println("Вы старше 20 лет. Ваш возраст = " + age);
        }

        char man = 'm';
        boolean isMan = man == 'm';
        if(isMan) {
            System.out.println("Ваш пол - мужской");
        }

        char woman = 'f';
        boolean isWoman = woman == 'f';
        if(isWoman) {
            System.out.println("Ваш пол - женский");
        }

        float height = 1.72f;
        boolean isHeight = height < 1.80;
        if(isHeight) {
            System.out.println("Ваш рост меньше 1 метр 80 см. Ваш рост = " + height);
        } else if(isHeight == false) {
            System.out.println("Ваш рост больше 1 метр 80 см. Ваш рост = " + height);
        }

        char name = 'М';
        if(name == 'М') {
            System.out.println("Ваше имя начинается на букву М");
        } else if(name == 'И') {
            System.out.println("Ваше имя начинается на букву И");
        } else {
            System.out.println("Ваше имя начинается не на букву М, и не на букву И");
        }
    }
}