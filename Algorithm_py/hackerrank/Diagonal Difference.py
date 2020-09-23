def diagonalDifference(arr):
    # Write your code here

    l = 0
    r = 0
    size = len(arr) - 1
    for i in range(0, len(arr)):
        for j in range(0, len(arr[i])):
            if i == j:
                l = l + arr[i][j]
            if j == size - i:
                r = r + arr[i][j]
    return abs(l - r)


arr = [[1, 2, 3], [4, 5, 6], [9, 8, 9]]
print(diagonalDifference(arr))
