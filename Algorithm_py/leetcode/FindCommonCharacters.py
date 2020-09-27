import string


class Solution(object):
    def commonChars(self, A):
        """
        :type A: List[str]
        :rtype: List[str]
        """
        result = list(A[0])  # 여기서 형변환..파이썬을 잘몰라서...
        for i in range(1, len(A)):
            checker = []
            for j in range(len(A[i])):
                s = A[i][j]
                if s in result:
                    checker.append(s)
                    result.remove(s)
            result = checker
        return result

        # temp = set(A[0])
        # result = []
        # for i in temp:
        #     count = []
        #     for j in A:
        #         count.append(j.count(i))
        #
        #     result.extend(i * min(count))
        #     print(i, result)
        #
        # return result


A = ["bella", "label", "roller"]
# A = ["cool", "lock", "cook"]
solution = Solution()
print(solution.commonChars(A))
