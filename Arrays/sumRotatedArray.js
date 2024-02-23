const sum = (nums, x) => {
  let rotationPoint = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > nums[i + 1]) rotationPoint = i + 1;
  }
  // console.log(sum([3, 5, 6, 7, 8, 1, 10], 12)); // true
  let left = nums.findIndex((n) => n === Math.min(...nums));
  let right = nums.findIndex((n) => n === Math.max(...nums));

  while (left === right) {
    let tempSum = nums[left] + nums[right];

    if (tempSum === x) return true;

    if (tempSum < x) {
      left = (left + 1) % nums.length;
    } else {
      right = (nums.length + right - 1) % nums.length;
    }
  }

  return false;
};

// Test cases
console.log(sum([3, 5, 6, 7, 8, 1, 10], 12)); // true
// console.log(sum([1, 2, 3, 4, 5], 10)); // false
