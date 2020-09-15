class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        arr = []
        for i in range(0, len(nums)):
            arr.insert(index[i], nums[i])
        return arr


nums = [0, 1, 2, 3, 4]
index = [0, 1, 2, 2, 1]
solution = Solution()
print(solution.createTargetArray(nums, index))
