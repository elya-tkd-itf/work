n = int(input())
mat = [0 for j in range(n)]
for i in range(n-1, -1, -1):
    mat[i] = list(map(int, input().split()))
print(mat)

f = open("output.txt", "w", encoding="utf-8")
for i in range(n):
    for j in range(n):
        f.write(str(mat[i][j])+" ")
    f.write('\n')