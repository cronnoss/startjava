/*TODO:Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры,  то [33, 126]
*/
package com.startjava.lesson_1.unicode;

public class Unicode {

    public static void main(String[] args) {
        for(char i = 9398; i <= 10178; i++) {
            System.out.println(i);
        }
    }
}