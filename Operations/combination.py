# A Python program to print all 
# combinations of given length
from itertools import combinations
 
# Get all combinations of [1, 2, 3]
# and length 2
comb = combinations([1, 2, 3], 2)
#print(comb)
# Print the obtained combinations
for i in list(comb):
    print i[0]