class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int

        Runtime: 8 ms, faster than 99.53% of Python online submissions for Subtract the Product and Sum of Digits of an Integer.
        Memory Usage: 12.6 MB, less than 82.89% of Python online submissions for Subtract the Product and Sum of Digits of an Integer.
        """
        temp = list(str(n))
        print(temp)

        m = 1
        a = 0
        for i in temp:
            m *= int(i)
            a += int(i)

        return m - a


n = 234
# n = 4421

solution = Solution()
print(solution.subtractProductAndSum(n))
