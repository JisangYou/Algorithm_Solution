# Depth First Search

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):

    def rangeSumBST(self, root, L, R):
        queue = [root]
        result = 0
        while queue:
            root = queue.pop(0)
            if root is not None:
                if root.val is not None and L <= root.val <= R:
                    result = result + root.val
                if root.left:
                    queue.append(root.left)
                if root.right:
                    queue.append(root.right)

        return result



L = 7
R = 15
solution = Solution()

print(solution.rangeSumBST(
    TreeNode(10, TreeNode(5, TreeNode(3), TreeNode(7)), TreeNode(15, TreeNode(None), TreeNode(18))), L, R))


# 재귀적용법으로 풀이

# class Solution(object):
#     def rangeSumBST(self, root, L, R):
#         def dfs(node):
#             if node:
#                 if L <= node.val <= R:
#                     self.ans += node.val
#                 if L < node.val:
#                     dfs(node.left)
#                 if node.val < R:
#                     dfs(node.right)
#
#         self.ans = 0
#         dfs(root)
#         return self.ans


# 반복용법으로 풀이

# class Solution(object):
#     def rangeSumBST(self, root, L, R):
#         ans = 0
#         stack = [root]
#         while stack:
#             node = stack.pop()
#             if node:
#                 if L <= node.val <= R:
#                     ans += node.val
#                 if L < node.val:
#                     stack.append(node.left)
#                 if node.val < R:
#                     stack.append(node.right)
#         return ans