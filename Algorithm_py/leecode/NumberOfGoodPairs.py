class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt = 0

        for i in range(0, len(nums)):
            for j in range(i, len(nums)):
                if nums[i] == nums[j] and i < j:
                    cnt += 1

        return cnt


# nums = [1, 2, 3, 1, 1, 3]
nums = [1, 1, 1, 1]

solution = Solution()
print(solution.numIdenticalPairs(nums))
