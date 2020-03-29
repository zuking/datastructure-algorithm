package com.zuking.datastructure;

/**
 * Created by zuking on 2020/3/26.
 * 合并两个顺序的链表
 */
public class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0);
        ListNode temp = newListNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 == null ? l2 : l1;
        return newListNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        mergeTwoLists(l1, l4);
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
