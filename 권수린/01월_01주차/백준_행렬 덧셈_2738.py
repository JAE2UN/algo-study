N, M = map(int, input().split())

A = [list(map(int, input().split())) for _ in range(N)]
B = [list(map(int, input().split())) for _ in range(N)]

for r in range(N):
    for c in range(M):
        print(A[r][c] + B[r][c], end=' ')
    print()