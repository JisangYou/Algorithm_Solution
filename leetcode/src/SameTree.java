import javax.sound.midi.SysexMessage;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  solution 참고
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        /**
         * Recursion(재귀)
         */

//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//
//        return isSameTree(p.right, q.right) &&
//                isSameTree(p.left, q.left);

        /**
         * 레벨 순서 순회이기 때문에, 큐를 활용해서 사용한다.
         * Iteration(반복)
         */

        Queue<TreeNode> queue = new LinkedList<>();
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        if (p != null && q != null) {
            queue.offer(p);
            queue.offer(q);
        }
        while (!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            if (first == null && second == null)
                continue;
            if (first == null || second == null)
                return false;
            if (first.val != second.val)
                return false;
            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);
        }
        return true;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SameTree sol = new SameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.print(sol.isSameTree(p, q));
    }
}
