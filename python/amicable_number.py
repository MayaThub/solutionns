def ami(n):
    sum = 0
    for i in range(1,n):
        if n%i == 0:
            sum += i
    return sum

n = int(input())

if(ami(ami(n)) == n):
    print("Amicable")
else:
    print("Not Amicable")