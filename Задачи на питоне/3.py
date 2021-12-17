f = open("input.txt", "r", encoding="utf-8")
d = dict()

n = int(f.readline())
for i in range(n):
    st1, st2 = f.readline()[:-1].split(": ")
    d.update({st1.lower() : st2})

m = int(f.readline())
for i in range(m):
    st = f.readline()[:-1].lower()
    if st in d.keys():
        print(d[st])
    else:
        print("Не найдено")