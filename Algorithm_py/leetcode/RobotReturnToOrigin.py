class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        ud_count = 0
        lr_count = 0

        for i in moves:
            if i == "U":
                ud_count = ud_count + 1
            elif i == "D":
                ud_count = ud_count - 1
            elif i == "L":
                lr_count = lr_count + 1
            elif i == "R":
                lr_count = lr_count - 1

        if lr_count == 0 and ud_count == 0:
            return True
        else:
            return False


moves = "UD"
# moves = "LL"
solution = Solution()
print(solution.judgeCircle(moves))
