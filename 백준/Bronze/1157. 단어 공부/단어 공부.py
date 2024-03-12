word = input().upper()
alphabet = list()

for i in range(65,91):
    alphabet.append(chr(i))

wordCount = list()

for i in alphabet:
    wordCount.append(word.count(i))

if wordCount.count(max(wordCount)) > 1:
    print("?")
else:
    print(alphabet[wordCount.index(max(wordCount))])