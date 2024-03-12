normal = [1, 1, 2, 2, 2, 8]

me = list(map(int, input().split()))

gap = []

for i in range(len(normal)):
    if normal[i] < me[i] or normal[i] > me[i] :
        gap.append(normal[i] - me[i])
    else:
        gap.append(0)

print(*gap)