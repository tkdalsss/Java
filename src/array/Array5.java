package array;

public class Array5 {
    public static void main(String[] args) {
        int a[][];
        int []b[];
        int [][]c;
        int[] []d;

        int e[][] = new int[10][10];
        int f[][] = new int[10][];
        f[1] = new int[3];
        f[0] = new int[5];

        int g[][][] = new int[5][][];

        int a1[][] = new int[2][];
        int a2[][] = new int[][]{{1,2}, {3,4}};
        a2[0] = new int[]{1,2};
        a2[1] = new int[]{2,3};
    }
}
