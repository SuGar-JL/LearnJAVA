package com.sugar.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @ClassName: demo_Vector
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 13:22
 */
public class demo_Vector {

    public static void main(String[] args) {

        //与ArrayList很像，但是Vector是线程安全的（可同步的）
        Vector<String> vector = new Vector<>();
        vector.add("aaa");
        vector.add("bbb");
        vector.add("ccc");
        vector.add(null);
        vector.add(null);

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + "、");//aaa、bbb、ccc、
        }

        ListIterator<String> stringListIterator = vector.listIterator();
        while (stringListIterator.hasNext()) {
            String str = stringListIterator.next();
            System.out.print(str + "、");//aaa、bbb、ccc、
        }


    }
}
