/*TODO: Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
- для проверки знака математической операции воспользуйтесь оператором if else
- выведите на экран результат работы калькулятора с помощью System.out.println()
*/
public class Calculator {
    public static void main(String[] args) {

        long x = 85;
        long y = 5;
        String SignOfMathematicalOperation = "-";
        long result = 0;
        if(x > 0 && y > 0) {
            if(SignOfMathematicalOperation == "+") {
                result = x + y;
            } else if (SignOfMathematicalOperation == "-") {
                result = x - y;
            } else if (SignOfMathematicalOperation == "*") {
                result = x * y;
            } else if(SignOfMathematicalOperation == "/") {
                result = x / y;
            } else if(SignOfMathematicalOperation == "^") {
                result = 1;
                for(int i = 1; i <= y; i++){
                    result = result * x; //Возведение в степень
                }
            } else if (SignOfMathematicalOperation == "%") {
                result = x % y;
            }
            System.out.println(x + " " + SignOfMathematicalOperation + " " + y + " = " + result);        
        } else {
            System.out.println("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число.");
        }
    }
}