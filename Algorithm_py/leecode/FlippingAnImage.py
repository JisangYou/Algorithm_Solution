class Solution(object):
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        temp = []
        for i in range(0, len(A)):
            for j in range(0, len(A[i])):
                if A[i][j] == 0:
                    A[i][j] = 1
                elif A[i][j] == 1:
                    A[i][j] = 0
            temp.append(A[i])

        result = []
        for i in range(0, len(temp)):
            result.append(list(reversed(temp[i])))

        return result

        # 다른 사람이 푼 간결한 코드...
        # result = []
        # for i in A:
        #     i.reverse()
        #     result.append(1 - x for x in i)
        # return result


A = [[1, 1, 0], [1, 0, 1], [0, 0, 0]]
solution = Solution()
print(solution.flipAndInvertImage(A))
