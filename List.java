
public class List {
    Node head;
    Node tail;

    private class Node {
        int value;
        Node prev;
        Node next;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null && tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void print() {
        Node current = this.head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = tail;
        
        do {
            Node tmp = current.next;
            current.next = current.prev;
            current.prev = tmp;
            //System.out.println(current.value + current.next.value);
            current = current.next;
            
        } while (current != null);

        Node tmp = head;
        head = tail;
        tail = tmp;
    }
}
