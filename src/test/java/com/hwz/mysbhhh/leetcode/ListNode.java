package com.hwz.mysbhhh.leetcode;

/**
 * @Auther: hwz
 * @Date: 2021/03/25/16:58
 * @Description: 自定义链表
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
