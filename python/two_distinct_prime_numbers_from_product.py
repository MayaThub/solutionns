import math

def isPrime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

def getDPN(n):
    if n <= 2 :
        return -1,-1
    for i in range(2,math.ceil(n/2)):
        if n % i == 0 and isPrime(i):
            other = n // i
            if isPrime(other) and i != other:
                return i,other
    return -1,-1

n = int(input())
a,b = getDPN(n)
print(a,b) if a != -1 else print("-1")
 