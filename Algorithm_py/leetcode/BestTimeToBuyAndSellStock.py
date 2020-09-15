'''''''''''''''''''''''''''''''''''''''

DP 문제

'''''''''''''''''''''''''''''''''''''''


class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        굳이 두 수를 뺀 나머지를 다 알 필요 없다.
        두 수 중 큰지/ 작은지만 알면된다.
        """

        """
        if not prices:
            return 0
        minNum = prices[0]
        maxNum = 0
        for i in range(0, len(prices)):
            minNum = min(minNum, prices[i])
            maxNum = max(maxNum, prices[i] - minNum)

        return maxNum
        """

        if not prices:
            return 0

        mn = prices[0]
        mx = 0

        for i in range(0, len(prices)):
            # print("i1", i)
            if mn > prices[i]:
                # print("mn", mn)
                # print("i2", i)
                mn = prices[i]
            temp = prices[i] - mn
            print("temp", temp)
            if mx < temp:
                mx = temp
        return mx


# prices = [7, 6, 4, 3, 1]
# prices = [1, 2, 4]
# prices = [2, 4, 1]
prices = [7, 1, 5, 3, 6, 4]
# prices = [2, 1, 2, 1, 0, 1, 2]
# prices = []
solution = Solution()
print(solution.maxProfit(prices))
