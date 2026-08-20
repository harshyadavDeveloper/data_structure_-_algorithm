class Main {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        System.out.println(first.data);
        System.out.println(first.next);

        first.next = second;
        System.out.println(first.next.data);
        second.next = third;
        // System.out.println(second.next.data);
        System.out.println(first.next.next.data);

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // start pointing at nothing until it is linked to smtg
    }
}