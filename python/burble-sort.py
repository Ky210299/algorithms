arr = [1,42,5,48,62,34,17,91,12,76,86,23, 26,3,2,6]

for i in range(arr.__len__()):
    for j in range(arr.__len__()-i-1):
        if arr[j+1] < arr[j]:
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
    print(arr)
