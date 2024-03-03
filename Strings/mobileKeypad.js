const convert = (input) => {
  let str = [
    "2",
    "22",
    "222",
    "3",
    "33",
    "333",
    "4",
    "44",
    "444",
    "5",
    "55",
    "555",
    "6",
    "66",
    "666",
    "7",
    "77",
    "777",
    "7777",
    "8",
    "88",
    "888",
    "9",
    "99",
    "999",
    "9999",
  ];

  let res = "";
  for (let i = 0; i < input.length; i++) {
    if (input[i] === " ") res += "0";
    else {
      let temp = input[i].charCodeAt(0) - "A".charCodeAt(0);
      res += str[temp];
    }
  }

  return res;
};
console.log(convert("PQRS"));
