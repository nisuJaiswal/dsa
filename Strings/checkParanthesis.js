let check = (str) => {
  let stack = [];

  for (let el of str) {
    if (el === "{" || el === "(" || el === "[") stack.push(el);
    else {
      if (
        stack.length === 0 ||
        (el === "}" && stack[stack.length - 1] !== "{") ||
        (el === "]" && stack[stack.length - 1] !== "[") ||
        (el === ")" && stack[stack.length - 1] !== "(")
      ) {
        return false;
      }
      stack.pop();
    }
  }

  return stack.length === 0;
};

let fasterWay = (str) => {
  let stack = [];
  for (let ch = 0; ch < str.length; ch++) {
    if (str[ch] === "(") stack.push(")");
    else if (str[ch] === "{") stack.push("}");
    else if (str[ch] === "[") stack.push("]");
    else {
      if (stack.pop() !== str[ch]) return false;
    }
  }
  return stack.length === 0;
};
console.log(fasterWay("(]"));
