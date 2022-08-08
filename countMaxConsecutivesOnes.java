import java.util.*;

class countMaxConsecutiveInes {

    public static int  findMaxConsOnes(int[] array) {
        int max = 0;
        int cur = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                cur++;
                if(max < cur) {
                    max = cur;
                }
            }
            else {
                cur = 0;
            }
        }
            return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int result =  findMaxConsOnes(array);
        System.out.println(result);
        sc.close();
    }
}