package array;

import java.util.Arrays;
import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // Random 하게 중복되지 않은 1~100까지의 수를 발생시킨다
        // 각 열에 최대값의 합과 최소값의 합을 출력하시오
        Random random = new Random();
        int[][] numbers = new int[5][5];
        int i = 0;
        int j = 0;
        int maxSum = 0;
        int minSum = 0;

        out:while (true) {
            int tmp = random.nextInt(100) + 1;

            if (!Arrays.asList(numbers).contains(tmp)) {
                numbers[i][j] = tmp;
                j++;
            }

            if (j >= numbers[0].length) {
                j = 0;
                if (i >= numbers.length-1) break out;
                i++;
            }
        }

        for (int[] row : numbers) {
            Arrays.sort(row);
            int max = row[row.length-1];
            int min = row[0];
            maxSum += max;
            minSum += min;
            System.out.println(Arrays.toString(row));
        }

        System.out.println("행별 최댓값 합 : " + maxSum);
        System.out.println("행별 최솟값 합 : " + minSum);
    }
}
