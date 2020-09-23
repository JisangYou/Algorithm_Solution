def compareTriplets(a, b):
    result = []
    result_a = 0
    result_b = 0
    for i in range(0, len(a)):
        if a[i] > b[i]:
            result_a = result_a + 1
        elif a[i] < b[i]:
            result_b = result_b + 1
    result.append(result_a)
    result.append(result_b)

    return result


a = [5, 6, 7]
b = [3, 6, 10]
print(compareTriplets(a, b))
