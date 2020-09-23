import os
import sys


#
# Complete the simpleArraySum function below.
#
def simpleArraySum(ar):
    #
    # Write your code here.
    #
    result = 0
    for i in ar:
        result = result + i
    return result


ar = [1, 2, 3, 4, 10, 11]
print(simpleArraySum(ar))
