const usingObject = function (nums) {
  let obj = {};
  let ans = false;

  nums.forEach((el) => {
    obj[el] ? obj[el]++ : (obj[el] = 1);
  });

  const values = Object.values(obj);
  values.forEach((val) => {
    if (val !== 1) ans = true;
  });
  return ans;
};

const usingLinearApproach = function (nums) {
  sorted = nums.sort((a, b) => a - b);

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == nums[i + 1]) return true;
  }
  return false;
};

const usingSet = (nums) => {
  const set = new Set();

  for (const num of nums) {
    if (set.has(num)) return true;
    set.add(num);
  }
  return false;
};
console.log(usingSet([1, 2, 3, 4, 5]));
