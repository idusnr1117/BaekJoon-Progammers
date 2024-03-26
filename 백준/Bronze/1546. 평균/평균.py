N = int(input())
A = input().split()
B = 0
for i in range(N):
    A[i] = int(A[i])

max_score = max(A)
for i in A:
    i = (i/max_score) * 100
    B += i
ans = B / N
print(ans)