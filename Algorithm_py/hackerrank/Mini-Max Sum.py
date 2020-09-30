import math
import os
import random
import re
import sys


# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    total = 0
    result = []

    for i in arr:
        total = i + total
    result.append(total - max(arr))
    result.append(total - min(arr))
    for i in result:
        print(i, end=' ')


arr = [1, 2, 3, 4, 5]
print(miniMaxSum(arr))
