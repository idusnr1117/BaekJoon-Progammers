second = 0

word = list(input())

for i in range(len(word)):
    if word[i] in ['A', 'B', 'C']:
        second += 3
    elif word[i] in ['D', 'E', 'F']:
        second += 4
    elif word[i] in ['G', 'H', 'I']:
        second += 5
    elif word[i] in ['J', 'K', 'L']:
        second += 6
    elif word[i] in ['M', 'N', 'O']:
        second += 7
    elif word[i] in ['P', 'Q', 'R', 'S']:
        second += 8
    elif word[i] in ['T', 'U', 'V']:
        second += 9
    elif word[i] in ['W', 'X', 'Y', 'Z']:
        second += 10

print(second)
