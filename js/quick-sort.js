const quickSort = (arr, left, right) =>{
  if (left >= right) return

  const pi = partition(arr, left, right);

  quickSort(arr, left, pi - 1);
  quickSort(arr, pi + 1, right);
}

const partition = (arr, left, right) => {
  let i = left;
  let j = right - 1;
  const pi = arr[right];

  while (i < j ) {
    while(arr[i] < pi && i < right) {
      i++;
    }
    while(arr[j] >= pi && j > left) {
      j--;
    }
    if (i < j){
      [ arr[i], arr[j] ] = [ arr[j], arr[i] ];
    }
  }
  if(arr[i] > pi) {
    [ arr[i], arr[right] ] = [ arr[right], arr[i] ];
  }
  return i
}

;(()=> {
  let arr = [];
  let l = 0;
  while (l < 100) {
    arr.push(Math.trunc((Math.random()*1000)));
    l++;
  }
  console.log(arr)
  quickSort(arr, 0, arr.length - 1);
  console.log(arr);
})()
