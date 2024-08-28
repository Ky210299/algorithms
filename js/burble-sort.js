let arr = [24,24,36,2,2,64,47,6,2,12,24,5,69,52,4,43,5,1,24,8,96,81,]

for (let i = 0; i < arr.length; i++) {
  for (let j = 0; j < (arr.length - i - 1); j++ ) {
    if (arr[j+1] < arr[j]) {
      let temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
  }
  console.log(arr);
}
