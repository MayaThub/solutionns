import math

def isPrime(n):
    if n == 1:
        return False
    if n == 2 or n == 3:
        return True
    for i in range(2, math.ceil(n ** 0.5) + 1):
        if n % i == 0 :
            return False
    return True
n = int(input())
print("Prime") if isPrime(n) else print("Not a Prime")
