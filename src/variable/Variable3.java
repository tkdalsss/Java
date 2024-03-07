package variable;

public class Variable3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");
        if (str1 == str3) { // str1.equals(str3);
            System.out.println("ok");
        }
    }
}
