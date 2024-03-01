const jsSpecific = (str) => {
  let s = str.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
  let temp = s;
  return temp === s.split("").reverse().join("");
};

const usingPointer = (str) => {
  let s = str.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
  let left = 0;
  let right = s.length - 1;

  while (left <= right) {
    if (s[left] !== s[right]) return false;

    left++;
    right--;
  }
  return true;
};

console.log(jsSpecific("A man, a plan, a canal: Panam"));
console.log(usingPointer("A man, a plan, a canal: Panam"));
