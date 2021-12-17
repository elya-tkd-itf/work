import math

def dfs(x):
    if vis[x]:
        return False
    vis[x] = True
    for (x,y) in E:
        if py[y] == -1:
            py[y] = x
            px[x] = y
            return True
        elif dfs(py[y]):
            py[y] = x
            px[x] = y
            return True
    return False

f = open("in.txt", "r")
k, l = map(int, f.readline().split())
L = range(k)
R = range(l)
e = int(f.readline())
E = []
for i in range(e):
    al = list(map(int, f.readline().split()))[:-1]
    for j in al:
        E.append((i, j-1))

px = [-1 for i in range(k)]
py = [-1 for i in range(l)]

isPath = True
while isPath:
    isPath = False
    vis = [False for i in range(k+l)]
    for x in L:
        if px[x] == -1:
            if dfs(x):
                isPath = True

fout = open("out.txt", "w")
for x in px:
    fout.write(str(x+1)+" ")
