# 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
base_list = [1, 1, 2, 2, 2, 8]
cur_list = list(map(int, input().split()))

for i in range(len(cur_list)):
    print(base_list[i]-cur_list[i], end=' ')