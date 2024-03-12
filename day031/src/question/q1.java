package question;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] workDay = {true, false, true, true, false, true, false};

        System.out.print("요일을 입력하세요(월요일-1 ~ 일요일-7) : ");
        int day = sc.nextInt();
        if (day < 1 || day >7) {
            System.out.println("1~7까지의 숫자로 입력해주세요(월요일:1 ~ 일요일:7)");
            return;
        }

        if (workDay[day-1]) System.out.println("oh my god~");
        else System.out.println("enjoy!");

        sc.close();
    }
}
