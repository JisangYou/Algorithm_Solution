class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        max1 = list(reversed(sorted(nums)))[0]
        max2 = list(reversed(sorted(nums)))[1]
        # length = len(nums)
        # max1 = sorted(nums)[length-1]
        # max2 = sorted(nums)[length-2]

        return (max1 - 1) * (max2 - 1)


nums = [3, 4, 5, 2]
solution = Solution()
print(solution.maxProduct(nums))
