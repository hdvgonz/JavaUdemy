import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomanToInteger {
    public static int RomanToInt(String s) {

        char[] c = s.toCharArray();
        int result = 0;
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        Iterator it = roman.keySet().iterator();

        for(int i = 0; i < s.length(); ++i) {

            int val = roman.get(c[i]);

            if (i == c.length-1 || roman.get(c[i+1]) <= roman.get(c[i])) {

                result += val;

            }else {
                result -= val;
            }


    }
        return result;
    }
    public static void main(String[] args) {


            }


}

//s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').