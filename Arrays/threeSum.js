const threeSum = (nums) => {
  let ans = [];
  if (nums.length < 3) return ans;

  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > 0) break;
    if (i > 0 && nums[i] === nums[i - 1]) continue;

    let left = i + 1;
    let right = nums.length - 1;

    while (left < right) {
      let sum = nums[i] + nums[left] + nums[right];

      if (sum < 0) left++;
      else if (sum > 0) right--;
      else {
        ans.push([nums[i], nums[left], nums[right]]);

        let lastLeft = nums[left];
        let lastRight = nums[right];

        while (left < right && nums[right] === lastRight) right--;
        while (left < right && nums[left] === lastLeft) left--;
      }
    }
  }

  return ans;
};
console.log(threeSum([-1, 0, 1, 2, -1, -4]));
