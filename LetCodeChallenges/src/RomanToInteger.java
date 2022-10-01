import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomanToInteger {
    public static int RomanToInt(String s) {

        int result = 0;


        return result;
    }
    public static void main(String[] args) {
        String s= "X";
        int result = 0;
        Map<Integer,String> roman = new HashMap<Integer,String>();
        roman.put(1,"I");
        roman.put(5,"X");
        roman.put(10,"X");
        roman.put(50,"L");
        roman.put(100,"C");
        roman.put(500,"D");
        roman.put(1000,"M");

        Iterator it = roman.keySet().iterator();

        while(it.hasNext()) {

            Integer key =  (Integer) it.next();

            if (roman.containsKey(s)) {


            }
        }

}
}
//s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').