word = input()

cnt = len(word)

list = ['c=', 'c-', 'd-', 'lj', 'nj', 's=', 'z=']

if word.count('dz=') >= 1:
        cnt -= word.count('dz=') * 2

for i in range(len(list)):
    if word.count(list[i]) >= 1:
        cnt -= word.count(list[i])

if word.count('dz=') >= 1 and word.count('z=') >= 1:
     cnt += word.count('dz=')

print(cnt)