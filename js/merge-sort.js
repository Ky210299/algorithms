let arr = [2,24,24,4,56,7,24,542,547,698,80,17,1,29,48,29,37,64,267,29,584,27,25,45,475,6,8862,52,65,86,37,2,4,6,8,0,4,3,2,1,45,7];

const mergeSort = (arr)=>{

  const arrSize = arr.length;
  // base case
  if(arrSize < 2){
    return
  }
  const middle = Math.trunc(arrSize / 2);
  let ls = arr.slice(0, middle);
  let rs = arr.slice(middle, arrSize);

  // recursion
  mergeSort(ls);
  mergeSort(rs);

  // Merge
  let i=0 ,j=0 ,k = 0;

  while(i < ls.length && j < rs.length) {
    if (ls[i] < rs[j]) {
      arr[k] = ls[i];
      i++;
    } else {
      arr[k] = rs[j];
      j++;
    }
    k++;
  }
  while(i < ls.length) {
    arr[k] = ls[i];
    i++;
    k++;
  }
  while(j < rs.length) {
    arr[k] = rs[j];
    j++;
    k++;
  }
}
console.log(arr);
mergeSort(arr);
console.log(arr);
