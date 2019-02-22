public class Cycle {

    public static void main(String[] args) {
        // TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
        for(int i = 1; i<=20; i++) {
            System.out.println(i);
        }
        
        // TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
        int j = -6;
        while(j <= 6){
            System.out.println(j);
            j += 2;
        }
        
        // TODO: Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
        /*
            11 + 13 + 15 + 17 + 19 = 75
            11 + 13 = 24
            24 + 15 = 39
            39 + 17 = 56
            56 + 19 = 75
        */
        int value = 11;
        int sum = 0;
        do {
            if(value % 2 != 0) { 
                sum += value;
            }
            value++;
        } while(value <= 20);
        System.out.println(sum);
    }
}