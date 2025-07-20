n = int(input())
arr = list(map(int,input().split()))
even = []
odd = []
res = []

for num in arr:
    if num & 1:
        odd.append(num)
    else:
        even.append(num)

el = len(even)
ol = len(odd)
i = 0
while i < (min(el,ol)):
    res.append(odd[i])
    res.append(even[i])
    i += 1


while i < el - 1:
    res.append(even[i])
    res.append(even[i + 1])
    i += 2

while i < ol - 1:
    res.append(odd[i])
    res.append(odd[i + 1])
    i += 2

if i == el - 1:
    res.append(even[i])
    res.append(0)
elif i == ol - 1:
    res.append(odd[i])
    res.append(0)
print(*res)
    
