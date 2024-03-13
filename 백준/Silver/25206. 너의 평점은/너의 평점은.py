rating = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']
num = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0]

total = 0
result = 0
for _ in range(20) :
    trash, num2, rating2 = input().split()
    num2 = float(num2)
    if rating2 != 'P' :
        total += num2
        result += num2 * num[rating.index(rating2)]

print('%.6f' % (result / total))