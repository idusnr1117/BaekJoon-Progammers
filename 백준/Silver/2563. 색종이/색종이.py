MAP = [[0]*100 for _ in range(100)]

n = int(input())

for _ in range(n):
    x, y = map(int, input().split())

    for i in range(y, y+10):
        idx_y = i

        for j in range(x, x+10):
            idx_x = j
            
            if MAP[idx_y][idx_x] == 0:
                MAP[idx_y][idx_x] = 1
            else:
                pass
            
SUM = 0
for i in range(100):
    SUM += sum(MAP[i])
print(SUM)