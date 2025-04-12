def isUN(n):
    seen = set()
    while n > 0:
        digit = n % 10
        if digit in seen:
            return False
        seen.add(digit)
        n //= 10
    return True

print("Unique Number") if isUN(int(input())) else print("Not Unique Number")
