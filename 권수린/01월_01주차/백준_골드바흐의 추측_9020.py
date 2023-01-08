# 소수 판별
def checkPrime(n):
    global isPrime
    
    for i in range(2, int(n ** 0.5) + 1):
        if isPrime[i]:
            isPrime[i] = 1
            for j in range(i + 1, n + 1):
                if j % i == 0:
                    isPrime[j] = 0

T = int(input())
isPrime = [2] * 10001
isPrime[1] = 1

for _ in range(T):
    number = int(input())
    answer = [0, number]

    if isPrime[number] == 2:
        checkPrime(number)
    
    for n in range(1, int(number / 2) + 1):
        if isPrime[n] and isPrime[number - n]:
            if answer[1] - answer[0] > number - 2 * n:
                answer = [n, number - n]
    
    print(f'{answer[0]} {answer[1]}')
