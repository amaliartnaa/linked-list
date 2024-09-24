package adt_implementation;

public class MyLinkedList<E> {

    Node<E> header;

//    cara menambahkan elemen ke linkedlist kita
    public void add(E value) {
        header = new Node<E>(value, header);
    }

    public void addAfter(E after, E value) {
        Node<E> here = header;
        while (here != null) {
            if (here.value == after) {
                Node<E> newNode = new Node<E>(value, here.next);
                here.next = newNode;
                return;
            } else {
                here = here.next;
            }
        }
    }

    public void printAll() {
        printValue(header);
        System.out.println();
    }

    private void printValue(Node<E> here) {
        while (here != null) {
            System.out.println(here.value + " ");
            here = here.next;
        }
    }

    public void printFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println(header.value);
        }
    }

    public boolean isEmpty() {
        return header == null;
    }
}

// here : variabel referensi penyimpan sementara, isinya adalah alamat dari node yang saat ini kita pinjam
// header: isinya referensi terhadap node yang paling depan
// here.next: alamat dari node berikutnya
// <E>, <T> itu apa? -> hanya sebagai placeholder, didefinisikan oleh user saat mendeklarasikan variabel linked list