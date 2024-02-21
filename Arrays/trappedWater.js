const calclulate = (nums) => {
  let left = 0;
  let right = nums.length - 1;

  let leftMax = 0;
  let rightMax = 0;

  let waterUnits = 0;

  while (left < right) {
    if (nums[left] < nums[right]) {
      leftMax = Math.max(leftMax, nums[left]);
      waterUnits += leftMax - nums[left];
      left++;
    } else {
      rightMax = Math.max(rightMax, nums[right]);
      waterUnits += rightMax - nums[right];
      right--;
    }
  }
  return waterUnits;
};

console.log(calclulate([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]));
