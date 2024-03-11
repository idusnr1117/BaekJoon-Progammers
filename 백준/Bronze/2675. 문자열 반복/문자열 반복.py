R = int(input())

for S in range(R):
    P, Str = input().split()
    text = ""
    for S in Str:
        text += S * int(P)
    print(text)