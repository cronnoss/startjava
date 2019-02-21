/*
Создайте класс Variable с методом main
Объявите в методе переменные всех существующих в Java примитивных типов данных. Каждой переменной присвойте значение
В качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
Выведите все значения переменных на консоль
Разберитесь с Git/GitHub, почитайте рекомендации о том, как с ними работать
Покажите Д/З наставнику
*/
public class Variable {
    public static void main(String[] args) {
        byte yadro = 4;
        short chastotaProzessora = 2500;
        int operativka = 10;
        long chastotaPamyati = 1600;
        float disk = 1.0f;
        double grafika = 1536.0d;
        char c = 'M';
        boolean Noviy = false;

        System.out.println(yadro);
        System.out.println(chastotaProzessora);
        System.out.println(operativka);
        System.out.println(chastotaPamyati);
        System.out.println(disk);
        System.out.println(grafika);
        System.out.println(c);
        System.out.println(Noviy);
    }
}