package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "jmlee@tonesol.com";
        String id = str.split("@")[0];
        String domain = str.split("@")[1];
        System.out.printf("%s, %s", id, domain);
    }
}
