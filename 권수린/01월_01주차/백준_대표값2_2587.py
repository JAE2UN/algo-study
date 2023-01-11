numbers = [0] * 5

for i in range(5):
    numbers[i] = int(input())

numbers.sort()

print(int(sum(numbers)/5))
print(numbers[2])