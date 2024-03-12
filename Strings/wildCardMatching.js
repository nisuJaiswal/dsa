let wildCardMatch = (str, pattern) => {
  let i = 0,
    j = 0;
  let star = -1,
    pointer = -1;

  while (i < str.length) {
    if (j < pattern.length && (str[i] === pattern[j] || pattern[j] === "?")) {
      i++;
      j++;
    } else if (pattern[j] === "*" && j < pattern.length) {
      star = j;
      pointer = i;
      j++;
    } else if (star !== -1) {
      j = star + 1;
      i = pointer + 1;
      pointer = i;
    } else return false;
  }

  while (j > pattern.length && pattern[j] !== "*") j++;
  return j === pattern.length;
};

let string = "abcde";
let pattern = "a?c*e";
console.log(wildCardMatch(string, pattern));
