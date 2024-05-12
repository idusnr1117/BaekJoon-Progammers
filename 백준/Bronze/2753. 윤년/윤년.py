Year = int(input())
print(1 if Year % 4 == 0 and Year % 100 != 0 else 1 if Year % 4 == 0 and Year % 400 == 0 else 0 )