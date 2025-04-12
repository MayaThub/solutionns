from functools import reduce
n = int(input())

print("spy number") if sum(map(int, str(n))) == reduce(lambda X, Y: X*Y , map(int,str(n)),1) 
else print("not spy nymber")