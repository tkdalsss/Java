package question;

import java.util.Arrays;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int idx = 0;
        int[] randomInt = new int[6];

        while (idx < 6) {
            int tmp = r.nextInt(1, 45) + 1;
            if (Arrays.stream(randomInt).boxed().toList().contains(tmp)) {
                System.out.print(tmp + "(중복발생! 재추첨) ");
            } else {
                randomInt[idx] = tmp;
                idx++;
                System.out.print(tmp+" ");
            }
        }
    }
}
