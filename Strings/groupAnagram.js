let getSign = (str) => {
  let arr = new Array(26).fill(0);

  for (let s of str) {
    arr[s.charCodeAt(0) - "a".charCodeAt(0)]++;
  }
  //   console.log(arr);

  let res = [];
  for (let i = 0; i < 26; i++) {
    if (arr[i] !== 0) {
      res.push(String.fromCharCode(i + "a".charCodeAt(0)), arr[i].toString());
    }
  }
  return res.join("");
};
// console.log(getSign("aabs"));
const groupAnagram = (strs) => {
  let res = [];
  let map = new Map();
  for (let i = 0; i < strs.length; i++) {
    let sign = getSign(strs[i]);

    if (!map.has(sign)) {
      map.set(sign, []);
    }
    map.get(sign).push(strs[i]);
  }
  //   console.log(map);
  map.forEach((el) => res.push(el));
  console.log(res);
};

groupAnagram(["ate", "eat", "nisu"]);
