import random


class Solution(object):
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        # result = []
        # for i in A:
        #     if i % 2 == 0:
        #         result.append(i)
        # for i in A:
        #     if i % 2 == 1:
        #         result.append(i)
        #
        # return result

        return ([x for x in A if x % 2 == 0] + [x for x in A if x % 2 == 1])


A = [3, 1, 2, 4]
# A = [0, 1]

solution = Solution()
print(solution.sortArrayByParity(A))
