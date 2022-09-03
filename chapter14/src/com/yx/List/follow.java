package com.yx.List;

import java.util.ArrayList;

public class follow {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(1);
        for (int i = 1;i <= 10; i++){
            list.add(i);
        }

        for (int i = 11;i<=15;i++){
            list.add(i);
        }

        list.add(100);
        list.add(200);
        list.add(null);

    }
}
