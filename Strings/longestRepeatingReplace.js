const longestRepeatingReplace = (str, k) => {
  let mapping = {};
  let right = 0,
    left = 0,
    maxCount = 0;

  while (right < str.length) {
    // console.log("Right: ", right, " left: ", left, " maxCount: ", maxCount);
    let letter = str[right];
    mapping[letter] = (mapping[letter] || 0) + 1;

    if (maxCount < mapping[letter]) maxCount = mapping[letter];

    if (right - left + 1 - maxCount > k) {
      mapping[str[letter]]--;
      left++;
    }

    // console.log("Right: ", right, " left: ", left, " maxCount: ", maxCount);
    right++;
  }

  return right - left;
};
console.log(longestRepeatingReplace("ABABBBB", 2));
