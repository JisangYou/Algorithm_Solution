public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // if(l1 == null) return l2;
        // else if(l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode tempNode = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tempNode.next = l1;
                l1 = l1.next;
                tempNode = tempNode.next;
            } else {
                tempNode.next = l2;
                l2 = l2.next;
                tempNode = tempNode.next;
            }

        }

        if (l1 == null)
            tempNode.next = l2;
        else
            tempNode.next = l1;
        return head.next;
    }


    public static void main(String[] args) {
        //TODO 추후에 다시 한번 확인 해볼 문제.

    }
}
