class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        cnt = 0
        for j in J:
            for s in S:
                if j == s:
                    cnt += 1
        return cnt


# J = "aA"
# S = "aAAbbbb"

J = "z"
S = "ZZ"


solution = Solution()
print(solution.numJewelsInStones(J, S))
