package com.zuking.datastructure;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by zuking on 2020/3/28.
 * 设计一个循环双端队列
 */
public class MyCircularDeque {
    //双端队列包含的元素大小
    private int size = 0;
    private int initCapacity = 0;
    private ArrayList<Integer> elements;

    public MyCircularDeque(int k) {
        this.initCapacity = k;
        size = 0;
        elements = new ArrayList<>();
    }

    public boolean insertFront(int value) {
        if (size == initCapacity) return false;
        elements.add(0, value);
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == initCapacity) return false;
        elements.add(size++, value);
        return true;
    }

    public boolean deleteFront() {
        if (size <= 0) return false;
        elements.remove(0);
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size <= 0) return false;
        elements.remove(size - 1);
        size--;
        return true;
    }

    public int getFront() {
        if (size <= 0) return -1;
        return elements.get(0);
    }

    public int getRear() {
        if (size <= 0) return -1;
        return elements.get(size - 1);
    }

    public boolean isEmpty() {
        return size <= 0 ? true : false;
    }

    public boolean isFull() {
        return size == initCapacity ? true : false;
    }
}
