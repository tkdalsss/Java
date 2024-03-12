package org.example.app.frame;

public interface Dao {
    int i = 0; // public static final int i = 0;
    public static final int ii = 10;

    public int method1();

    default int method2() {
        return 0;
    }

    public static int method3() {
        return 0;
    }
}
