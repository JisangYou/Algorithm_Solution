def solution(prices):
    answer = []
    for i in range(len(prices)):
        number = 0
        for j in range(i + 1, len(prices)):
            if prices[i] <= prices[j]:
                number = number + 1
            else:
                number = number + 1
                break
        answer.append(number)
    return answer


prices = [1, 2, 3, 2, 3]
# prices = [2, 1, 4, 1, 2]
# prices = [5, 4, 3, 2, 1]
print(solution(prices))
