from collections import Counter
n, m = map(int, input().split())
arra = list(map(int,input().split()))
arrb = list(map(int,input().split()))

freq_a = Counter(arra)
freq_b = Counter(arrb)

list = []

for num,freq in freq_a.items():
    if freq == 1 and num not in arrb:
        list.append(num)
for num,freq in freq_b.items():
    if freq == 1 and num not in arra:
        list.append(num)

print(*list)
