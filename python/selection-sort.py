def main():
    arr = [2,56,4,2,345,58,5,346,25,1,27,37,16,38,48,57,62,17]

    #recorro el array
    #guardo el primer numero
    #voy comparando cada elemento con el numero guardado
    #si es menor lo cambio al indice actual

    for i in range(0, len(arr)):
        minor = i
        for j in range(i+1, len(arr)):
            if arr[minor] > arr[j]:
                minor = j
        temp = arr[i]
        arr[i] = arr[minor]
        arr[minor] = temp
        print(arr)

if __name__ == "__main__":
    main()
