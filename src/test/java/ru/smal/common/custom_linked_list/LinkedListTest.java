package ru.smal.common.custom_linked_list;

import org.junit.jupiter.api.Test;
import ru.smal.common.custom_collection.custom_linked_list.LinkedList;

class LinkedListTest {

    @Test
    void addFirst() {

    }

    @Test
    void addTail() {

    }

    @Test
    void getIndex() {

    }

    @Test
    void remove() {

    }

    private LinkedList<String> buildLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        return list;
    }
}