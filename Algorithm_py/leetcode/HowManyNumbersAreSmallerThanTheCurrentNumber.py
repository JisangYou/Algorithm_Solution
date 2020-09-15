class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]

        success : faster than 14.14%
        """
        result = []
        cnt = 0
        for i in range(0, len(nums)):
            for j in range(0, len(nums)):
                if nums[i] > nums[j] and i != j:
                    cnt = cnt + 1
            result.append(cnt)
            cnt = 0
        return result


nums = [8, 1, 2, 2, 3]
# nums = [6, 5, 4, 8]
solution = Solution()
print(solution.smallerNumbersThanCurrent(nums))
