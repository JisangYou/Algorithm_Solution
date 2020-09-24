import math
import os
import random
import re
import sys


# Complete the plusMinus function below.
def plusMinus(arr):
    p = 0
    z = 0
    n = 0
    result = []
    size = len(arr)

    for i in ar:
        if i > 0:
            p = p + 1
        elif i == 0:
            z = z + 1
        else:
            n = n + 1

    result.append("{0:.6f}".format(round(p / size, 6)))
    result.append("{0:.6f}".format(round(n / size, 6)))
    result.append("{0:.6f}".format(round(z / size, 6)))

    for i in result:
        print(i)


ar = [-4, 3, -9, 0, 4, 1]
print(plusMinus(ar))
