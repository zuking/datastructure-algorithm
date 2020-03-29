package com.zuking.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by zuking on 2020/3/24.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        try {
            arrayList.add(4, "d");
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
