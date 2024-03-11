num = int(input())
a = 1 
for i in range(num, 0, -1):
    print(" " * (i - 1) + "*" * a)
    a += 1