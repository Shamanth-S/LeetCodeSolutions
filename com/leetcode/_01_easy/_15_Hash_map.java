package com.leetcode._01_easy;

public class _15_Hash_map {

    private final int SIZE = 1000;
    private ListNode[] buckets;

    private static class ListNode {
        int key;
        int value;
        ListNode next;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void MyHashMap() {
        buckets = new ListNode[SIZE];
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);

        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);

        if (prev.next != null) {
            return prev.next.value;
        }

        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    private ListNode findElement(int index, int key) {
        if (buckets[index] == null) {
            buckets[index] = new ListNode(-1, -1);
        }

        ListNode prev = buckets[index];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
}
