import random
import sys


'''
문제가 잘 이해가 안감.
랜덤한 수들로 결과 값 나와야 하는 것 아닌지?
'''

class Solution(object):
    def sumZero(self, n):
        """
        :type n: int
        :rtype: List[int]
        """

        arr = []
        total = 0

        for i in range(n - 1):
            ran = random.randint(-sys.maxsize, sys.maxsize)
            arr.append(ran)
            total = total + ran

        arr.append(-total)

        return arr


n = 0
solution = Solution()
print(solution.sumZero(n))
