def dig_sum(n):
    sum = 0
    for i in range(1,n):
        if n%i == 0:
            sum += i
    return sum

n = int(input())

if(dig_sum(n) == n):
    print("True")
else:
    print("False")
