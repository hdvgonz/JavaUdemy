import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean validParentheses (String s){

        Deque <Character> pila = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {

                pila.push(x);
                continue; // ir a la siguiente iteracion
            }
                if(pila.isEmpty())
                    return false;


                char check;

                switch (x) {
                    case ')':
                        check = pila.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;
                    case ']':
                        check = pila.pop();
                        if (check == '(' || check == '{')
                            return false;


                        break;
                    case '}':
                        check = pila.pop();
                        if (check == '[' || check == '(')
                            return false;
                        break;
            }
        }



       return (pila.isEmpty());

    }

    public static void main(String[] args) {

        System.out.println(validParentheses("("));


    }
}
