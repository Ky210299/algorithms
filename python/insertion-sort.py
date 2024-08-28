arr = [2,5,6,23,25,31,2,542,5,78,4,3,6,7,8,2,12,34,6,7,678,9,6,5,243,23,235,6,75,457,5684,568,568,54,34,2,1,0]

def main():
    for i in range(1, len(arr)):
        current = arr[i]
        j = i - 1

        while j > 0 and arr[j] > current:
            arr[j+1] = arr[j]
            j -= 1
        arr[j] = current
        print(arr)

if __name__ == "__main__":
    main()
