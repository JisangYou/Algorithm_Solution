class Solution(object):
    def peakIndexInMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        peak = max(arr)
        result = 0
        for i in range(0, len(arr)):
            if arr[i] == peak:
                result = i
                break

        return result


arr = [0, 1, 0]
solution = Solution()
print(solution.peakIndexInMountainArray(arr))
