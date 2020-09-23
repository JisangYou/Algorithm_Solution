import math
import os
import random
import re
import sys


# Complete the aVeryBigSum function below.
def aVeryBigSum(ar):
    result = 0

    for i in ar:
        result = result + i
    return result


ar = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]
print(aVeryBigSum(ar))
