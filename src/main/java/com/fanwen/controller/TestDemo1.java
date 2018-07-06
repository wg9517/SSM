package com.fanwen.controller;

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i <= 100; i++) {
            list.add("s" + i);
        }
        list.toArray();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String i = (String) iterator.next();
            System.out.println(i);
        }
    }
}
