let checkFromMiddle = (str, left, right) => {
  while (left >= 0 && right < str.length && str[left] === str[right]) {
    right++;
    left--;
  }
  return right - left - 1;
};

const longestPalindrome = (str) => {
  let start = 0,
    end = 0;
  for (let i = 0; i < str.length; i++) {
    let firstLen = checkFromMiddle(str, i, i);
    let secondLen = checkFromMiddle(str, i, i + 1);

    let len = Math.max(firstLen, secondLen);
    console.log(firstLen, secondLen);

    if (end - start < len) {
      start = i - Math.floor((len - 1) / 2);
      end = i + Math.floor(len / 2);
    }
  }

  return str.substring(start, end + 1);
};

console.log(longestPalindrome("babad"));
