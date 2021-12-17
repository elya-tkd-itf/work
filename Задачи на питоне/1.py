import random
import time

def quicksort(nums):
   if len(nums) <= 1:
       return nums
   else:
       q = random.choice(nums)
   l_nums = [n for n in nums if n < q]
 
   e_nums = [q] * nums.count(q)
   b_nums = [n for n in nums if n > q]
   return quicksort(l_nums) + e_nums + quicksort(b_nums)

def merge_sort(L):
    if len(L) < 2:
        return L[:]
    else:
        middle = int(len(L) / 2)
        left = merge_sort(L[:middle])
        right = merge_sort(L[middle:])
        return merge(left, right)

def merge(left, right):
    result = []
    i, j = 0, 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    while i < len(left):
        result.append(left[i])
        i += 1
    while j < len(right):
        result.append(right[j])
        j += 1
    return result

def find_speed():
    arr = [random.randint(-10**5, 10**5) for i in range(10**5)]

    time_quicksort = time.time()
    quicksort(arr)
    print("Сортировка 10^5 случайных чисел методом быстрой сортировки заняла", time.time()-time_quicksort, "секунд.")

    time_merge = time.time()
    merge_sort(arr)
    print("Сортировка 10^5 случайных чисел методом слияния заняла", time.time()-time_merge, "секунд.")

    print("Временная сложность данных алгоритмов = O(n logn), но, как видно из приведенного выше эксперимента, скорость быстрой сортировки выше.")

print("В файле input.txt находится строка, в которой все числа разделены пробелами. Ответ заносится в файл output.txt в виде одного числа.")

arr = list(map(int, open("input.txt", "r").readline().split(" ")))
open("output.txt", "w").write(str(quicksort(arr)))

find_speed()