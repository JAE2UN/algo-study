# 그룹단어 체크 함수
def checkGroupWord(word):
    already_used = [word[0]]

    for i in range(1, len(word)):
        if word[i] != word[i - 1] and word[i] in already_used:
            return 0
        else:
            already_used.append(word[i])
    
    return 1


N = int(input())
total = 0

for _ in range(N):
    total += checkGroupWord(input())

print(total)