a = []
try:
    for i in range(100):
        a.append(input())
except EOFError:
    pass

for i in range(len(a)):
    print(a[i])
