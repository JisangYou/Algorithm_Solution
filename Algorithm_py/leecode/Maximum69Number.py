class Solution(object):
    def maximum69Number(self, num):
        """
        :type num: int
        :rtype: int
        """

        arr = list(str(num))

        for i in range(0, len(arr)):
            if arr[i] == '6':
                arr[i] = '9'
                break
        return int(''.join(arr))


num = 9669
solution = Solution()
print(solution.maximum69Number(num))
