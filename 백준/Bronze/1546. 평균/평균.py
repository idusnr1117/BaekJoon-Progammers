n = int(input())
a = input().split()
ans = 0

for i in range(n):
    a[i] = int(a[i])

max_score = max(a)
for i in a:
    i = i / max_score * 100
    ans += i
ans /= n
print(ans)
