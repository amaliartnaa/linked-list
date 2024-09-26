package study_case;

public class CustomerQueue {

    Node head;

    static class Node {

        String customerName;
        Node next;

        Node (String name) {
            customerName = name;
            next = null;
        }
    }

//    tambah pelanggan baru ke dalam antrian
    public static CustomerQueue enqueue(CustomerQueue queue, String name) {
        Node new_node = new Node(name);

        if (queue.head == null) {
            queue.head = new_node;
        } else {
            Node last = queue.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return queue;
    }

//    layani pelanggan (hapus dari depan antrian) -> FIFO
    public static CustomerQueue dequeue(CustomerQueue queue) {
        if (queue.head == null) {
            System.out.println("Antrian kosong");
            return queue;
        }

        System.out.println(queue.head.customerName + " sudah dilayani");
        queue.head = queue.head.next; // menghapus pelanggan di depan antrian

        return queue;
    }

//    tampilkan semua pelanggan di antrian
    static void printQueue(CustomerQueue queue) {
        Node currNode = queue.head;

        System.out.println("Antrian pelanggan: ");

        if (currNode == null) {
            System.out.println("Antrian kosong");
        } else {
            while (currNode != null) {
                System.out.println(currNode.customerName);
                currNode = currNode.next;
            }
        }
    }

    public static void main(String[] args) {
        CustomerQueue queue = new CustomerQueue();

//        tambah pelanggan ke antrian
        queue = enqueue(queue, "Amel");
        queue = enqueue(queue, "Budi");
        queue = enqueue(queue, "Cindy");
        queue = enqueue(queue, "Dodi");

//        tampilkan antrian
        printQueue(queue);

//        layani beberapa pelanggan
        queue = dequeue(queue);
        queue = dequeue(queue);

//        print antrian setelah melayani
        printQueue(queue);
    }
}
