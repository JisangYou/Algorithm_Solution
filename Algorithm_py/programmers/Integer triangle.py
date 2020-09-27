def solution(triangle):
    def recursive():


        for i in range(len(triangle)):
            for j in range(len(triangle[i])):
                print(triangle[i][j])


triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))
