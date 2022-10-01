public class PalindromeNumber {
    public static boolean isPalindrome (int x) {

        boolean resp = false;
        String t = String.valueOf(x);
        int tam = t.length();
        int cont = 0;
        bucle1:
        for(int i = 0; i < tam; i++){

            if(t.charAt(i) == t.charAt(tam-i-1)){
                cont++;
                continue bucle1;

            } else {
                break;
            }
        }
        if (cont == tam){
            resp = true;
        }


        return resp;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(111));


    }
}
