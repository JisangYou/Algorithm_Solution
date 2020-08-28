package DataStructure;


public class PrintTheElementsOfaLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

//    static class SinglyLinkedList {
//        public SinglyLinkedListNode head;
//        public SinglyLinkedListNode tail;
//
//        public SinglyLinkedList() {
//            this.head = null;
//            this.tail = null;
//        }
//
//        public void insertNode(int nodeData) {
//            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
//
//            if (this.head == null) {
//                this.head = node;
//            } else {
//                this.tail.next = node;
//            }
//
//            this.tail = node;
//        }
//    }

    public void printLinkedList(SinglyLinkedListNode head) {

        if (head != null) {
            SinglyLinkedListNode temp;
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintTheElementsOfaLinkedList p = new PrintTheElementsOfaLinkedList();
        SinglyLinkedListNode node = new SinglyLinkedListNode(16);
        node.next = new SinglyLinkedListNode(13);
        p.printLinkedList(node);
    }
}
