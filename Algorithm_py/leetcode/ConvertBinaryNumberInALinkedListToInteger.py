'''

Runtime: 12 ms, faster than 97.74% of Python online submissions for Convert Binary Number in a Linked List to Integer.
Memory Usage: 12.7 MB, less than 54.37% of Python online submissions for Convert Binary Number in a Linked List to Integer.

'''

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: ListNode
        :rtype: int
        """
        stack = []
        result = 0

        while head is not None:
            stack.append(head.val)
            head = head.next

        size = len(stack)
        for i in range(size):
            result = result + stack.pop() * 2 ** i
        return result


solution = Solution()
# print(solution.getDecimalValue(ListNode(1, ListNode(0, ListNode(1)))))
print(solution.getDecimalValue(ListNode(1, ListNode(0, ListNode(0, ListNode(1, ListNode(0, ListNode(0, ListNode(1,
                                                                                                                ListNode(
                                                                                                                    1,
                                                                                                                    ListNode(
                                                                                                                        1,
                                                                                                                        ListNode(
                                                                                                                            0,
                                                                                                                            ListNode(
                                                                                                                                0,
                                                                                                                                ListNode(
                                                                                                                                    0,
                                                                                                                                    ListNode(
                                                                                                                                        0,
                                                                                                                                        ListNode(
                                                                                                                                            0,
                                                                                                                                            ListNode(
                                                                                                                                                0)))))))))))))))))
