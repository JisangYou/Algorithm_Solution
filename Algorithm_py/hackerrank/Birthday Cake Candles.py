import math
import os
import random
import re
import sys


def birthdayCakeCandles(candles):
    # Write your code here
    max_num = max(candles)
    cnt = 0
    for i in candles:
        if i == max_num:
            cnt = cnt + 1
    return cnt


candle = [3, 2, 1, 3]
print(birthdayCakeCandles(candle))
