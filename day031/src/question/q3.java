package question;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 10사이의 숫자를 입력해주세요 : ");
        int input = sc.nextInt();

        if (input < 1 || input > 10) {
            System.out.println("1부터 10사이의 숫자를 입력해주세요!");
            return;
        }

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
