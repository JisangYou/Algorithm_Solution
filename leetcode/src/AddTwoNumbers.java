import java.util.ArrayList;
import java.util.LinkedList;

public class AddTwoNumbers {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


//    ArrayList arrayList = new ArrayList();


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;


        ListNode prev = new ListNode(0);
        ListNode dummy = prev;
        int result = 0;

        while (l1 != null || l2 != null) {
            result /= 10; // 나눗셈 연산을 통해 몫이 있다면, 다음 반복시에 적용한다.
            if (l1 != null) {
                result += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                result += l2.val;
                l2 = l2.next;
            }

            dummy.next = new ListNode(result % 10); // 결과가 10보다 크면, %연산을 통해 나머지 값을 대입한다.
            dummy = dummy.next;

        }
        if (result / 10 == 1) {// 가장 뒤에 나온 수의 합이 10이 넘을 때는 노드 1의 값을 가지게 하여, 하나를 추가해준다.
            dummy.next = new ListNode(1);
        }
        return prev.next;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers sol = new AddTwoNumbers();
        sol.addTwoNumbers(l1, l2);

    }
}
