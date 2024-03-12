rows = int(input()) * 2 - 1

for i in range(rows):
    spaces = abs(rows // 2 - i)
    stars = rows - 2 * spaces

    print(" " * spaces, end="")
    print("*" * stars, end="\n")