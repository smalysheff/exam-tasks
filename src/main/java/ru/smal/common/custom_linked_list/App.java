package ru.smal.common.custom_linked_list;

public class App {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addTail("B");
        list.addTail("C");
        list.addTail("D");
        System.out.println("LL: " + list);

        list.addFirst("A");
        System.out.println("LL: " + list);

        System.out.println("Index element A: " + list.getIndex("A"));
        System.out.println("Index element C: " + list.getIndex("C"));
        System.out.println("Index element ZZ: " + list.getIndex("ZZ"));

        list.remove("C");
        System.out.println("LL: " + list);
    }
}
