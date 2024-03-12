package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] random = new int[10];
        int sum = 0;

        int idx = 0;
        while(true) {
            int tmp = r.nextInt(100) + 1;
            if (!Arrays.asList(random).contains(tmp)) {
                random[idx] = tmp;
                idx ++;
            }
            if (idx >= random.length) break;
        }

        for (int ra : random) {
            sum += ra;
        }

        System.out.println("배열 : " + Arrays.toString(random));
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double) sum / random.length);
    }
}
