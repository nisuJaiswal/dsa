const usingMap = (str) => {
  if (!str) return false;

  let map = new Map();

  for (let el of str) {
    if (map.has(el)) {
      map.set(el, map.get(el) + 1);
    } else {
      map.set(el, 1);
    }
  }
  //   console.log(map);
  for (let [key, val] of map) {
    // console.log(val);
    if (val > 1) {
      //   console.log("inside");
      console.log(key, ": ", val);
    }
  }
  //   return map;
};

const usingSorting = (str) => {
  str = str.split("").sort().join("");
  console.log(str);

  for (let i = 0; i < str.length; i++) {
    let count = 1;
    while (i < str.length && str[i] === str[i + 1]) {
      count++;
      i++;
    }
    if (count > 1) console.log(str[i], ": ", count);
  }
};
// usingSorting("geeksforgeeks");
// console.log(printDuplicates("geeksforgeeks"));
