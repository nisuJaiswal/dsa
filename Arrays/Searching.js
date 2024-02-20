const usingFor = (nums, target) => {
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === target) return i;
  }

  return -1;
};

const usingInBuilt = (nums, target) => {
  return nums.findIndex((n) => n === target);
};
const nums = [0, 54, 1, 2, 3, 4, 7];

console.log(usingFor(nums, 10));
console.log(usingInBuilt(nums, 10));
// console.log(Number.MAX_VALUE)
