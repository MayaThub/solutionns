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

n = int(input())
count = 2
for i in range(2,math.ceil(n/2) + 1):
    if n % i == 0 and isPrime(i) == False :
        count += 1
print(count)
