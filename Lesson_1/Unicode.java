public class Unicode{
    public static void main(String[] args) {
        /*TODO:Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры,  то [33, 126]
        */
        for(char i = 0x33; i <= 0x126; i++){
            System.out.println(i);
        }

    }
}
            // int i = 0x9398;
            //         int cc;
            //         for(i = 0x9398; i <= 0x9340; i++){
            //             cc = i;
            //             System.out.println(i);
            //             char ccc = (char) Integer.parseInt(String.valueOf(cc), 16);
            //             String text = String.valueOf(ccc);
            //             System.out.println(i +


        // Работает
        // int cc = 0x9400;
        // char ccc = (char) Integer.parseInt(String.valueOf(cc), 16);
        // String text = String.valueOf(ccc);
        // System.out.println(ccc + " " + text);


        // Вот блок для печати символов unicode между \u00c0 и \u00ff
        // char[] ca = {'\u00c0'};
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 16; j++) {
        //         String sc = new String(ca);
        //         System.out.print(sc + " ");
        //         ca[0]++;
        //     }
        //     System.out.println();
        // }


        // int foo = (int)'\u9398'; 
        // char bar = (char)'\u9398'; 
        // System.out.println (foo); 
        // System.out.println (bar);
        // int i = 9398;
        // int c = 0x9398;
        // String s = String.valueOf(c);;
        // String b = String.valueOf(i);
        // String foo = (String)"0x" + b;
        // char bar = String.valueOf(foo);
        // char bar = (char)"foo";
        // String foo2 = foo;
        // System.out.println(s);
        // int i = 2203;
        // // char b = \ u + i;
        // char a = 0x2202;
        
        // char c = 0x9398;//aka 8706 in decimal. "\ u" codepoints are in hex.
        // c = a;
        // // char s = "0x" + String.valueOf(i);
        // String s = "0x" + String.valueOf(i);
        // System.out.println(s);
        // String symbol = "\u9398";
        // int c = 2202;
        // String symbol =  "\ u" + c;
        // System.out.println(symbol);
        // int i = 9398;
        // char b = (char) i;
        // System.out.println(b);
        // char j = '\u9398';
        
        // String res = i;
        // for(i = 9398; i <= 9410; i++){
            // int res = i;
            // System.out.println("i = " + i + " " + "res = " + 0x + res);
          
        // System.out.println(res);
        // }
    // }
// }

        // System.out.println(0x5A3);
        // System.out.println(0x0171);
        // System.out.println(0410);
        // System.out.println(0x9398);
        // System.out.println("鎘");
        // System.out.println(0x09398);
        // System.out.println(0x009398);
        // System.out.println("0x9399");
        // System.out.println("鎙");
        // System.out.println(0x10178);
        // System.out.println("ဗ");
        // System.out.println(0x010178);
        // System.out.println(0x0010178);
        // System.out.println("0xБ");
        // System.out.println("Ħ");
