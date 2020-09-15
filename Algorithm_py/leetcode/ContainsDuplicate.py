class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """

        if len(set(nums)) != len(nums):
            return True
        else:
            return False


nums = [1, 2, 3, 1]
solution = Solution()
print(solution.containsDuplicate(nums))
