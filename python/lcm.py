import math
def FindLCM(a,b):
    return abs(a*b) // math.gcd(a,b)

a,b = map(int,input().split())

print(FindLCM(a,b))