import random

def quick_sort(arr, left, right):
    if left >= right:
        return

    pi = partition(arr, left, right)
    quick_sort(arr, left, pi-1)
    quick_sort(arr, pi+1, right)

def partition(arr, left, right):
    i = left
    j = right-1
    pi = arr[right]

    while i < j:
        while i < right and arr[i] < pi:
            i+=1
        while j > left and  arr[j] >= pi:
            j-=1
        if i < j:
            arr[i], arr[j] = arr[j], arr[i]

    if arr[i] > pi:
        arr[i], arr[right] = arr[right], arr[i]

    return i
def main():
    z = 0
    arr = []
    while z < 100:
        arr.append((random.random()* 1000).__trunc__())
        z+=1

    quick_sort(arr, 0, len(arr)-1)
    print(arr)

if __name__ == "__main__":
    main()
