package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while (true) {
            System.out.println("Input Command (q, c, r, u, d) ..");
            String cmd = sc.next();
            if(cmd.equals("q")) {
                System.out.println("Quit...");
                break;
            }
            switch(cmd) {
                case "c":
                    System.out.println("create");
                    break;
                case "r":
                    String id = sc.next();
                    System.out.println("Read ID Info");
                    break;
//                    System.out.println("read");
//                    break out;
                case "U":
                    System.out.println("update");
                    break;
                case "d":
                    System.out.println("delete");
                    break;
                default:
                    System.out.println("Input command Error");
            }

        }
        System.out.println("End..");
        sc.close();
    }
}
