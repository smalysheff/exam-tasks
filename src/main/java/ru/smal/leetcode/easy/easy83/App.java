package ru.smal.leetcode.easy.easy83;

import java.util.Objects;

public class App {

    public static void main(String[] args) {

        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(1, listNode0);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(5, listNode3);
        ListNode listNode5 = new ListNode(5, listNode4);

        System.out.println(listNode5);

        System.out.println(deleteDuplicates(listNode5));

    }

//    recursive method
//    public static ListNode deleteDuplicates(ListNode head) {
//        //1 -> 1 -> 2 -> 3 -> 3 -> null
//        if (Objects.isNull(head) || Objects.isNull(head.next)) {
//            return head;
//        }
//
//        head.next = deleteDuplicates(head.next);
//
//        return head.next.val == head.val ? head.next : head;
//    }

    public static ListNode deleteDuplicates(ListNode head) {
        //1 -> 1 -> 2 -> 3 -> 3 -> null
        if (Objects.isNull(head)) {
            return head;
        }

        ListNode current = head;
        while (Objects.nonNull(current.next)) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
