n1 = int(input())
n2s = int(str(n1)[::-1]) ** 2
print(True) if n1 ** 2 == int(str(n2s)[::-1]) else print(False)
