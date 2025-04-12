n = int(input())

sign = -1 if n < 0 else 1

n *= sign 

rev = 0
while n != 0 :
    dig = n % 10
    n //= 10
    rev = rev*10 + dig
print(rev * sign)
