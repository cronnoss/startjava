/*TODO:Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры,  то [33, 126]
*/
public class Unicode {
    public static void main(String[] args) {

        for(char i = 0x33; i <= 0x126; i++) {
            System.out.println(i);
        }
    }
}