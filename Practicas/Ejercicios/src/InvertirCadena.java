import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        String str = "DelfStack";
        System.out.println(str);
        char[] ch = str.toCharArray();
        int begin = 0;
        int end = ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
            begin++;
        }
        str = new String(ch);
        System.out.println(str);


    }
}
