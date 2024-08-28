let arr = [3,2,5,6,7,3,1,4,7,8,9,5,3,12,24,52,47,59,3,12,36,45,28,94,73,14]

for (let i = 0; i < arr.length; i++){
  const current = arr[i];
  let j = i-1;

  while(j > 0 && arr[j] > current) {
    arr[j+1] = arr[j];
    arr[j] = current;
    j--;
  }
console.log(arr);
}
