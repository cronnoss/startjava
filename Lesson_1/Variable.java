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
        byte core = 4;
        short cpuFrequency = 2500;
        int ddr3RAM = 10;
        long memoryFrequency = 1600;
        float ssdDrive = 120.0f;
        double gpuFrequency = 1536.0d;
        char operatingSystem = 'M';
        boolean modern = false;

        System.out.println(core);
        System.out.println(cpuFrequency);
        System.out.println(ddr3RAM);
        System.out.println(memoryFrequency);
        System.out.println(ssdDrive);
        System.out.println(gpuFrequency);
        System.out.println(operatingSystem);
        System.out.println(modern);
    }
}