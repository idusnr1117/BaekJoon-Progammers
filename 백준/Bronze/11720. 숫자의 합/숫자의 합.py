n = int(input())
nums = input()
nums_list = list(nums)
result = 0


for i in range(len(nums_list)):
    result += int(nums_list[i])

print(result)