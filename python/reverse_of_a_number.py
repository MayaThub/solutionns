n = int(input())

rev = 0
while n != 0 :
    dig = n % 10
    n //= 10
    rev = rev*10 + dig
print(rev)
