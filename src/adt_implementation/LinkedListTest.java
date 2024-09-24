package adt_implementation;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();

        mll.printFirst();
//        System.out.println(mll.isEmpty()); // linked list yg kosong

        mll.add("Faris");
//        mll.printAll();

        mll.add("Arsya");
//        mll.printAll();

        mll.add("Yubi");
//        mll.printAll();

        mll.add("Amel");
//        mll.printAll();
    }
}
