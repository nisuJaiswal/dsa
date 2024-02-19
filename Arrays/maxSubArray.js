const array = [1, -2, 3, -3, 5, -6];

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
