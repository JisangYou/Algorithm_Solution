class Solution(object):
    def decompressRLElist(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []

        for i in range(0, len(nums)):
            if i % 2 == 0:
                for j in range(0, nums[i]):
                    result.append(nums[i + 1])
        return result


# nums = [1, 2, 3, 4]
nums = [1, 1, 2, 3]
solution = Solution()
print(solution.decompressRLElist(nums))
