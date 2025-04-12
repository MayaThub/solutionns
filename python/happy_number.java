def isHappy(n):
    if n < 10 :
        return True if n == 1 or n == 7 else False
    n2 = sum(map(lambda digit: int(digit) ** 2, str(n).strip()))
    return isHappy(n2)

n = int(input())
print(isHappy(n))
