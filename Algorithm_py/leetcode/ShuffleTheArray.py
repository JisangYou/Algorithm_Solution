class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """

        temp1 = nums[0:n]
        temp2 = nums[n:2 * n]

        result = []
        for i in range(0, n):
            result.append(temp1[i])
            result.append(temp2[i])

        return result


# nums = [2, 5, 1, 3, 4, 7]
# n = 3

nums = [1, 2, 3, 4, 4, 3, 2, 1]
n = 4

solution = Solution()
print(solution.shuffle(nums, n))
