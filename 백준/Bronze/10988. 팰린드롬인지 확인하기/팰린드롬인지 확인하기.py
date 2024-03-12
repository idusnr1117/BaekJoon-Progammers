word = list(input())
reverse_word = word.copy()
reverse_word.reverse()
cnt = 0

half = int(len(word)/2)

for i in range(half):
    if word[i] == reverse_word[i]:
        cnt += 1
if cnt == half:
    print(1)
else:
    print(0)