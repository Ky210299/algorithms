from typing import List


arr = [2,24,25,47,58,326,125,412,25,47,53,950,569,46,24,14,16,18,209,27,47,59,40,27,38,49,450,37,78,679,8,236]

def merge(ls, rs):
    sorted_arr = []
    while len(ls) > 0 and len(rs) > 0:
        if ls[0] < rs[0]:
            sorted_arr.append(ls[0])
            ls.pop(0)
        else :
            sorted_arr.append(rs[0])
            rs.pop(0)
    while len(ls) > 0:
        sorted_arr.append(ls[0])
        ls.pop(0)

    while len(rs) > 0:
        sorted_arr.append(rs[0])
        rs.pop(0)

    return sorted_arr
def merge_sort(array):
    if len(array) == 1:
        return array

    middle = len(array) // 2
    ls = array[:middle]
    rs = array[middle:]

    sorted_ls = merge_sort(ls)
    sorted_rs = merge_sort(rs)

    return merge(sorted_ls, sorted_rs)

def merge_sort_indexs(array):
    if len(array) <= 1:
        return

    middle = len(array) // 2
    left_arr = array[:middle]
    right_arr = array[len(array) - middle:]

    merge_sort_indexs(left_arr)
    merge_sort_indexs(right_arr)

    i = 0
    j = 0
    k = 0

    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            array[k] = left_arr[i]
            i+=1
        else:
            array[k] = right_arr[j]
            j+=1
        k+=1

    while i < len(left_arr):
        array[k] = left_arr[i]
        i+=1
        k+=1
    while j < len(right_arr):
        array[k] = right_arr[j]
        j+=1
        k+=1


def main():
    is_sorted = merge_sort(arr)
    print(is_sorted)
    print("is sorted with the index")
    merge_sort_indexs(arr)
    print(arr)

if __name__ == "__main__":
    main()



    # [2,4,5,7,8,9,] [1,7,8,9,10,29]

