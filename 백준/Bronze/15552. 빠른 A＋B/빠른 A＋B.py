import sys
A = int(sys.stdin.readline())
for i in range(A):
    B = list(map(int, sys.stdin.readline().rstrip().split()))
    print(B[0] + B[1])