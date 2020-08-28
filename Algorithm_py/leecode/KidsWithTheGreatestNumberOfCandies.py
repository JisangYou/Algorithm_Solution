class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        maxNum = max(candies)
        result = []
        for candy in candies:
            if candy + extraCandies >= maxNum:
                result.append(True)
            else:
                result.append(False)

        return result


# candies = [2, 3, 5, 1, 3]
# extraCandies = 3

candies = [4, 2, 1, 1, 2]
extraCandies = 1
solution = Solution()
print(solution.kidsWithCandies(candies, extraCandies))
