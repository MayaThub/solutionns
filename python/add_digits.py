def dig_sum(n):
    return sum(map(int,str(n)))

n = int(input())
while(n >= 10):
    n = dig_sum(n)

print(n)