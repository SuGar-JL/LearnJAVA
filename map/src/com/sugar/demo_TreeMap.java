package com.sugar;

import java.util.TreeMap;

/**
 * @ClassName: demo_TreeMap
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 15:30
 */
public class demo_TreeMap {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.put("b", null);
//        treeMap.put(null, 2);//key不能为null

        System.out.println(treeMap);//
    }
}
