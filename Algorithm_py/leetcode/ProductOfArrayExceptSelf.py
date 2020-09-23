class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # result = []
        #
        # def loop(cnt):
        #     temp = 1
        #
        #     for i in range(0, len(nums)):
        #         if i != cnt:
        #             temp = temp * nums[i]
        #     return temp
        #
        # for i in range(0, len(nums)):
        #     result.append(loop(i))
        #
        # return result

        length = len(nums)

        L, R, answer = [0] * length, [0] * length, [0] * length

        L[0] = 1
        for i in range(1, length):
            print(i)
            L[i] = nums[i - 1] * L[i - 1]

        R[length - 1] = 1
        for i in reversed(range(length - 1)):
            R[i] = nums[i + 1] * R[i + 1]

        for i in range(length):
            answer[i] = L[i] * R[i]

        return answer


nums = [1, 2, 3, 4]
# nums = [0, 0]
# nums = [1, 0]
solution = Solution()
print(solution.productExceptSelf(nums))
