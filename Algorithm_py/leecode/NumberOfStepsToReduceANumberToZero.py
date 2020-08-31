import math


class Solution(object):
    def numberOfSteps(self, num):
        """
        :type num: int
        :rtype: int
        """
        cnt = 0
        while num > 0:
            cnt += 1
            if num % 2 == 1:
                num -= 1
            else:
                num /= 2
        return cnt


num = 14

solution = Solution()
print(solution.numberOfSteps(num))
