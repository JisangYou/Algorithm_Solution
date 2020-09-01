class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """

        tempDict = {}
        for i in range(0, len(indices)):
            tempDict.setdefault(indices[i], s[i])

        resultDict = sorted(tempDict.items())

        '''
        파이썬은 아래와 같이, 해시맵(딕셔너리)형태로 포문을 돌려
        key, value 를 뽑아 낼 수 있다.
        '''
        result = ""
        for k, v in resultDict:
            result += v

        return result


s = "codeleet"
indices = [4, 5, 6, 7, 0, 2, 1, 3]
solution = Solution()
print(solution.restoreString(s, indices))
