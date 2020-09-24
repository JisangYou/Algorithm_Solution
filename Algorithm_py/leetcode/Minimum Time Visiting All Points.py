import heapq


class Solution(object):
    def minTimeToVisitAllPoints(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        s1 = points[0][0]
        s2 = points[0][1]
        result = 0
        for i in range(1, len(points)):
            result = max(abs(s1 - points[i][0]), abs(s2 - points[i][1])) + result
            s1 = points[i][0]
            s2 = points[i][1]

        return result

points = [[1, 1], [3, 4], [-1, 0]]
points = [[3,2],[-2,2]]

solution = Solution()
print(solution.minTimeToVisitAllPoints(points))
