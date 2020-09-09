class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        굳이 두 수를 뺀 나머지를 다 알 필요 없다.
        두 수 중 큰지/ 작은지만 알면된다.
        """

        if not prices:
            return 0

        mn = prices[0]
        mx = 0
        for i in range(1, len(prices)):
            if mn > prices[i]:
                mn = prices[i]

            else:
                if mx < prices[i]:
                    mx = prices[i]
                    mn =



# prices = [7, 6, 4, 3, 1]
# prices = [1, 2, 4]
prices = [2, 4, 1]
# prices = [7, 1, 5, 3, 6, 4]
# prices = []
solution = Solution()
print(solution.maxProfit(prices))
