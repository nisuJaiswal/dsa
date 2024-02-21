const KthLargest = (nums, k) => {
  nums = nums.sort((a, b) => a - b);

  return nums[nums.length - k];
};
const nums = [3, 2, 1, 5, 6, 4, 6];
console.log(KthLargest(nums, 2));
