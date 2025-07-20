n, m = map(int, input().split())
arra = set(map(int,input().split()))
arrb = set(map(int,input().split()))

print(len(arra.intersection(arrb)))
