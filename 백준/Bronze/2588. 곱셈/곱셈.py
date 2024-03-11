a = int(input())
b = list(map(int,list(input())))

print(a * b[2])
print(a * b[1])
print(a * b[0])
print((a * b[2]) + (a * (b[1] * 10))+(a * (b[0] * 100)))