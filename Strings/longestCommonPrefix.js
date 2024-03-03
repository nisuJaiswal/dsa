const longestPrefix = (str) => {
  let prefix = "";

  str.sort();
  let left = str[0],
    right = str[str.length - 1];

  for (let i = 0; i < Math.min(left.length, right.length); i++) {
    if (left[i] !== right[i]) return prefix;
    prefix += left[i];
  }

  return prefix;
};
console.log(longestPrefix(["flower", "flow", "flowers"]));
