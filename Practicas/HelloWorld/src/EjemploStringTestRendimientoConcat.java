public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicial = System.currentTimeMillis();



        for (int i=0; i<1000;i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 demora 2ms, 1000 -> 5ms
            //c += a + b + "\n"; //500 demora 15 ms, 1000 ->15ms
            // sb.append(a).append(b).append("\n"); esto es una forma
            //esta es otra:
            sb.append(a); //StringBuilder es el mas eficiente 0ms; 1000 ->0ms
            sb.append(b);
            sb.append("\n");
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);

}
}