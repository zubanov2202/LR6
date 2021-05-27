package com.example.lr6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Integer> NumberCollection = new ArrayList<Integer>();

    @org.junit.Test
    public void Test() {
        NumberCollection.add(2);
        NumberCollection.add(4);
        NumberCollection.add(10);
        NumberCollection.add(12);
        NumberCollection.add(20);
        NumberCollection.add(24);
        NumberCollection.add(42);
        NumberCollection.add(50);
        NumberCollection.add(54);
        NumberCollection.add(60);

        System.out.println("Before replacement: " + NumberCollection);
        System.out.println("The array NumberCollection have inside:" + " " + getCount() + " elements. "  );


        replaceElements();
        System.out.println("After replacement: " + NumberCollection);

    }

    public <Integer> int  getCount() {
        int count;
        for (count = 0; count < NumberCollection.size(); count++) { }
        return count;
    }

    public <Integer> void replaceElements() {
        int v1, v2;
        v1 = NumberCollection.get(3);
        v2 = NumberCollection.get(4);
        NumberCollection.set(3, v2);
        NumberCollection.set(4, v1);
    }
}
