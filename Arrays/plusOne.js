const linearApproach = (nums) => {
  for (let i = nums.length - 1; i >= 0; i--) {
    if (nums[i] === 9) nums[i] = 0;
    else {
      nums[i]++;
      return nums;
    }
  }
  nums.unshift(1);
  return nums;
};

const jsSpecific = (nums) => {
  let num = nums.join("");
  let number = Number(num) + 1;
  return number.toString().split("");
};
console.log(jsSpecific([9]));
console.log(linearApproach([9]));
