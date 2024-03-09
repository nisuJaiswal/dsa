let checkFromCenter = (str, left, right) => {
  let count = 0;
  while (left >= 0 && right < str.length && str[left] === str[right]) {
    count++;
    left--;
    right++;
  }
  return count;
};

const noOfPalindrome = (str) => {
  if (str.length < 1) return 0;
  if (str.length === 1) return 1;

  let res = 0;
  for (let i = 0; i < str.length; i++) {
    let odd = checkFromCenter(str, i, i);
    let even = checkFromCenter(str, i, i + 1);

    res += odd + even;
  }
  return res;
};

console.log(noOfPalindrome("aaa"));
