package array;

public class Array6 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}, {4,5,6}};
        System.out.println(a.length);
        System.out.println(a[0].length);

        for (int[] ar : a) {
            for(int num : ar) {
                System.out.println(num + " ");
            }
        }
    }
}
