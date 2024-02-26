const containerWater = (height) => {
  let left = 0;
  let right = height.length - 1;
  let water = 0;

  while (left < right) {
    let tempWater = Math.min(height[left], height[right]) * (right - left);
    console.log(tempWater, water);
    water = Math.max(tempWater, water);

    if (height[left] < height[right]) left++;
    else right--;
  }
  return water;
};

console.log(containerWater([1, 8, 6, 2, 5, 4, 8, 3, 7]));
