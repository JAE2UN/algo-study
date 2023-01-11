X = int(input())
total = 0
target = 0

for i in range(1, X + 1):
    total += i

    if total >= X:
        target = i
        break

a = X - (total - target)
b = target - a + 1

if target % 2:
    print(f'{b}/{a}')
else:
    print(f'{a}/{b}')