class Solution(object):
    def destCity(self, paths):
        """
        :type paths: List[List[str]]
        :rtype: str
        """
        self.result = None

        def recursion(paths, start, visited):
            for i in paths:
                if i[0] == start and i[0] != visited:
                    self.result = i[1]
                    recursion(paths, self.result, i[0])

        recursion(paths, paths[0][0], None)
        return self.result


# paths = [["London", "New York"], ["New York", "Lima"], ["Lima", "Sao Paulo"]]
paths = [["B", "C"], ["D", "B"], ["C", "A"]]
solution = Solution()
print(solution.destCity(paths))
