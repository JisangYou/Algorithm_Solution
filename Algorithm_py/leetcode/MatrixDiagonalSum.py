class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        result = 0
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if i == j:
                    result = result + mat[i][j]
                elif j == len(mat) - i - 1:
                    result = result + mat[i][len(mat) - i - 1]

        return result


mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# mat = [[1, 1, 1, 1],
#        [1, 1, 1, 1],
#        [1, 1, 1, 1],
#        [1, 1, 1, 1]]
solution = Solution()
print(solution.diagonalSum(mat))
