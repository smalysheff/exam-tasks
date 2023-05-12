package ru.smal.common.custom_collection.custom_linked_list;

import java.util.Objects;

public class LinkedList<T> {

    private Node<T> head;

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void add(int index, T t) {
        if (index == 0) {
            addFirst(t);
        } else {
            Node<T> newNode = new Node<>(t);

            Node<T> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void addTail(T t) {
        if (Objects.isNull(head)) {
            head = new Node<>(t);
            return;
        }

        Node<T> currentNode = head;
        while (Objects.nonNull(currentNode.next)) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int getIndex(T t) {
        if (Objects.isNull(head)) {
            return -1;
        }

        if (head.value == t) {
            return 0;
        }

        int result = 0;
        Node<T> currentNode = head;
        while (Objects.nonNull(currentNode.next)) {
            ++result;
            if (currentNode.next.value == t) {
                return result;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    public void remove(T t) {
        if (Objects.isNull(head)) {
            return;
        }

        if (head.value == t) {
            head = head.next;
        }

        Node<T> currentNode = head;
        while (Objects.nonNull(currentNode.next)) {
            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {

        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
