class Solution(object):
    def xorOperation(self, n, start):
        """
        :type n: int
        :type start: int
        :rtype: int
        Runtime: 12 ms, faster than 97.64% of Python online submissions for XOR Operation in an Array.
        Memory Usage: 12.9 MB, less than 12.28% of Python online submissions for XOR Operation in an Array.
        """
        result = 0
        for i in range(0, n):
            result ^= start + 2 * i
        return result


n = 5
start = 0

solution = Solution()
print(solution.xorOperation(n, start))
