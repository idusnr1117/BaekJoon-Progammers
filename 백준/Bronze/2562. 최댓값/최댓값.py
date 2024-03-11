num = 0
a = []

for i in range(9):
    a.append(int(input()))
        
for i in range(len(a)):
    if (max(a) == a[i]):
        num = i + 1

print(max(a), num)