package org.example.app.dao;

import org.example.app.frame.Dao;

public class Test implements Dao {
    @Override
    public int method1() {
        int i = Dao.method3();
        return 0;
    }

    public int method2() {
        return 100;
    }

}
