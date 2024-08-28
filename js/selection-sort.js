let arr = [1,4,65,8,4,2,26,48,50,15,45,67,19,38,58,52,473,79,24,13,24,46,63,67];

for(let i = 0; i < arr.length; i++) {
  let minor = i;
  for(let j = i+1; j < arr.length; j++) {
    if (arr[j] < arr[minor]) {
      minor = j;
    }
    let temp = arr[i];
    arr[i] = arr[minor];
    arr[minor] = temp;
  }
  console.log(arr);
}
