N = int(input())
numbers = list(map(int, input().split()))
rlt = 0
target = int(input())

for i in range(N):
    if numbers[i] == target:
        rlt += 1

print(rlt)