const numOfSum = (nums) => {
  let len = nums.length;
  let start = 0;
  let end = len - 1;
  let ans = 0;

  while (start <= end) {
    if (nums[start] === nums[end]) {
      start++;
      end--;
    }

    // [1, 4, 5, 9, 1]
    else if (nums[start] < nums[end]) {
      start++;
      nums[start] += nums[start - 1];
      ans++;
    } else {
      end--;
      nums[end] += nums[end + 1];
      ans++;
    }
  }
  return ans;
};

console.log(numOfSum([1, 4, 5, 9, 1]));
