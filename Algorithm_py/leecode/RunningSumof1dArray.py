class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        temp = 0
        for i in nums:
            temp = temp + i
            result.append(temp)

        return result


nums = [1, 2, 3, 4]
solution = Solution()
print(solution.runningSum(nums))
