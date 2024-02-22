const maxProduct = (nums) => {
  if (nums.length < 0) return false;

  let maxProd = nums[0];
  let minProd = nums[0];
  let res = nums[0];

  for (let i = 1; i < nums.length; i++) {
    if (nums[i] < 0) {
      [maxProd, minProd] = [minProd, maxProd];
    }

    maxProd = Math.max(nums[i], nums[i] * maxProd);
    minProd = Math.min(nums[i], nums[i] * minProd);

    res = Math.max(res, maxProd);
  }

  return res;
};
console.log(maxProduct([2, 3, -2, 4]));
