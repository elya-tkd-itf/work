import math
def get_link_v(v,D):
    for i, weight in enumerate(D[v]):
        if weight>0:
            yield i

def arg_min(T, S):
    amin = -1
    m = math.inf  # максимальное значение
    for i, t in enumerate(T):
        if t < m and i not in S:
            m = t
            amin = i
    return amin

f = open("in.txt", "r")
N = int(f.readline()) # число вершин в графе
D = [[0 for i in range(N)] for j in range(N)] # таблица смежности
for i in range(N):
    ll = list(map(int, f.readline().split()))
    if len(ll) == 1:
        continue
    for j in range(0, len(ll)-2, 2):
        D[ll[j]-1][i] = ll[j+1]

st = int(f.readline())-1 # стартовая вершина (нумерация с нуля)
fin = int(f.readline())-1 # конечная вершина (нумерация с нуля)
v = st

T = [math.inf]*N   # последняя строка таблицы
V = [0]*N   # список предыдущих вершин
S = {v}     # просмотренные вершины
T[v] = 1    # нулевой вес для стартовой вершины
while v != -1:          # цикл, пока не просмотрим все вершины
    for j in get_link_v(v, D):   # перебираем все связанные вершины с вершиной v
        if j not in S:           # если вершина еще не просмотрена
            w = T[v] * D[v][j]
            if w < T[j]:
                T[j] = w
                V[j] = v
    v = arg_min(T, S)            # выбираем следующий узел с наименьшим весом
    if v >= 0:                    # выбрана очередная вершина
        S.add(v)                 # добавляем новую вершину в рассмотрение

fout = open("out.txt", "w")
if T[fin] == math.inf:
    fout.write("NO")
else:
    fout.write("YES\n")
    otv = [fin]
    while otv[-1] != st:
        otv.append(V[otv[-1]])
    for i in range(len(otv)-1, -1, -1):
        fout.write(str(otv[i]+1)+" ")