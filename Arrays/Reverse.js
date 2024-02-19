const arr = [10, 9, 8, 7, 6];

const reverseArrStatic = (arr) => {
  return arr.reverse();
};
const reverseUsingSwap = (arr, start, end) => {
  // console.log(arr)
  while (start < end) {
    let temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
  return arr;
};

const reverseUsingStack = (arr) => {
  let stack = [];
  arr.forEach((el) => stack.push(el));
  let reversedArr = [];

  while (stack.length) reversedArr.push(stack.pop());

  return reversedArr;
};

const reverseUsingRecursion = (arr, start, end) => {
  let temp = arr[start];
  arr[start] = arr[end];
  arr[end] = temp;

  if (start + 1 < end - 1) {
    reverseUsingRecursion(arr, start + 1, end - 1);
  }

  return arr;
};
// console.log(reverseArrStatic(arr))
// console.log(reverseUsingSwap(arr,0,arr.length -1 ))
// console.log(reverseUsingStack(arr));
console.log(reverseUsingRecursion(arr, 0, arr.length - 1));
