import math
import os
import random
import re
import sys


# Complete the staircase function below.
def staircase(n):
    for i in range(n):
        for j in range(n):
            if n - i - 1 <= j:
                print('#', end='')
            else:
                print(' ', end='')
        print('')


n = 7
print(staircase(n))
