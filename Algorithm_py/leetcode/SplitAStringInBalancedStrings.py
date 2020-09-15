class Solution(object):
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        diff = 0
        result = 0
        for i in range(0, len(s)):
            if s[i] == "R":
                diff = diff + 1
            elif s[i] == "L":
                diff = diff - 1

            if diff == 0:
                result = result + 1
        return result


# s = "RLRRLLRLRL"
# s = "RLLLLRRRLR"
s = "LLLLRRRR"
solution = Solution()
print(solution.balancedStringSplit(s))
