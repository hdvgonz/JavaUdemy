public class TwoSum {


    public static void main(String[] args) {

        boolean val = false;
        int[] numbers = {3,3};
        int target = 6;
        int lng = numbers.length;
        int[] result = new int[2];
        for (int i = 0; i < lng; i ++) {
            for (int j = 1; j < lng; j++) {

                if((numbers[j] + numbers[i] == target) && (i != j))
                {
                    result[0] = i;
                    result[1] = j;
                    System.out.println("Las posiciones son: " + result[0] + " , " + result[1]);
                    val = true;

                }

            }
            if (val){
                break;
            }

        }

    }
}
