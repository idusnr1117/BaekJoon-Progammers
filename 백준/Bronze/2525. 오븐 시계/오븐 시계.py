H, M = map(int, input().split())
C = int(input())

H *= 60
H += M + C

M = H % 60
H = H / 60 
if (int(H) >= 24):
    H -= 24
print(int(H), M)
