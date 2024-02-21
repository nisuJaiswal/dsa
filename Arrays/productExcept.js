const productExcept = (nums) => {
  const len = nums.length;
  let leftProducts = new Array(len).fill(1);
  let rightProducts = new Array(len).fill(1);
  let res = [];

  let leftProduct = 1;
  for (let i = 1; i < len; i++) {
    leftProduct *= nums[i - 1];
    leftProducts[i] = leftProduct;
  }

  let rightProduct = 1;
  for (let i = len - 2; i >= 0; i--) {
    rightProduct *= nums[i + 1];
    rightProducts[i] = rightProduct;
  }

  for (let i = 0; i < len; i++) {
    res[i] = leftProducts[i] * rightProducts[i];
  }
  console.log(leftProducts, rightProducts);
  return res;
};

console.log(productExcept([1, 2, 3, 4]));
