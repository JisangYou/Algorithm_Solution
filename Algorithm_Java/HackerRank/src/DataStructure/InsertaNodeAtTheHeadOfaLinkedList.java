package DataStructure;

public class InsertaNodeAtTheHeadOfaLinkedList {

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
//    }


    /**
     *
     * @param llist
     * @param data
     * @return
     *
     *  예시가 조금 애매함.
     *  linkedlist 문제 접근 방법이 미숙함.
     *
     *
     */

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        n.data = data;
        n.next = null;
        if (llist == null) {
            return n;
        }
        /* Inserts a new Node at front of the list. */
        n.next = llist;
        llist = n;
        return llist;
    }

    public static void main(String[] args) {

    }

}
