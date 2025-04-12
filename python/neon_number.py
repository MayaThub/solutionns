import math
n = int(input())
print("Neon Number") if n == sum(map(int,str(n*n))) else print("Not Neon Number")