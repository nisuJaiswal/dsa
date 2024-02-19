const array = [-2, 1, -3, 4, -1, 2, 1, -5, 4];

const maxSumSubArray = (arr) => {
  let tempSum = 0;
  let sumToReturn = -9999;

  arr.forEach((el) => {
    tempSum += el;
    if (tempSum < el) tempSum = el;
    if (sumToReturn < tempSum) sumToReturn = tempSum;
  });
  return sumToReturn;
};
console.log(maxSumSubArray(array));
