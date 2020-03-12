package DataStructure;


public class PrintTheElementsOf_a_Linked_list {

    static class Node {
        int data;
        Node next;
    }

    public void Print(Node head) {

        if (head != null) {
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintTheElementsOf_a_Linked_list p = new PrintTheElementsOf_a_Linked_list();
        Node node = new Node();
        node.data = 2;
        node.next = new Node();
        node.next.data = 16;
        node.next.next = new Node();
        node.next.next.data = 13;

        p.Print(node);
    }
}
