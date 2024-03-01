const maxSubArray = (nums, n, k) => {
  let map = new Map();
  let sum = 0;
  let mod_arr = Array(n);
  let count = 0;

  for (let i = 0; i < n; i++) {
    sum += nums[i];

    mod_arr[i] = sum % k;

    if (mod_arr[i] === 0) count++;
    else if (!map.has(mod_arr[i])) {
      map.set(mod_arr[i], i);
    } else {
      if (count < i - map.get(mod_arr[i])) count = i - map.get(mod_arr[i]);
    }

    console.log(mod_arr, sum, map, count);
  }

  return count;
};
console.log(maxSubArray([2, 7, 6, 1, 4, 5], 6, 3));
