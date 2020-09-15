'''
permutation 순열 : 순열이란 n개의 원소를 사용해서 순서를 정하여 r개의 배열로 나타내는 것을 말한다. 순열은 순서가 있기 때문에 원소의 종류가 같아도 순서가 다르면 다른배열이 된다.
combination 조합 : 조합은 순서가 없어서 원소의 종류가 같으면 같은 배열로 나타낸다.
'''

from itertools import permutations
from itertools import combinations


class Solution(object):
    def countGoodTriplets(self, arr, a, b, c):
        """
        :type arr: List[int]
        :type a: int
        :type b: int
        :type c: int
        :rtype: int
        Runtime: 624 ms, faster than 39.43% of Python online submissions for Count Good Triplets.
        Memory Usage: 12.9 MB, less than 22.45% of Python online submissions for Count Good Triplets.
        """
        # 본인은 문제 그대로 3중 배열로 처리했
        # result = 0
        # for i in range(0, len(arr)):
        #     for j in range(i, len(arr)):
        #         for k in range(j, len(arr)):
        #             if i < j < k and abs(arr[i] - arr[j]) <= a and abs(arr[j] - arr[k]) <= b and abs(
        #                     arr[i] - arr[k]) <= c:
        #                 result = result + 1
        #
        # return result

        # 다른 사람은 외장함수를 통해 처리함. 순열/조합
        # permu = permutations(arr, 3)
        combi = combinations(arr, 3)

        # print(list(permu))
        # print(list(combi))
        fin = []
        for i in combi:
            if abs(i[0] - i[1]) <= a and abs(i[1] - i[2]) <= b and abs(i[0] - i[2]) <= c:
                print(i)
                fin.append(i)

        return len(fin)


arr = [3, 0, 1, 1, 9, 7]
a = 7
b = 2
c = 3

# arr = [1, 1, 2, 2, 3]
# a = 0
# b = 0
# c = 1
solution = Solution()
print(solution.countGoodTriplets(arr, a, b, c))
