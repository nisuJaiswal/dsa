const arr = ["54", "546", "548", "60"];
const sortNumber = (arr) => {
  arr.sort((a, b) => {
    let ab = a + b;
    let ba = b + a;
    return ba - ab;
  });
  return arr.join("");
};
console.log(sortNumber(arr));
