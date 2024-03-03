const longetstSubWithoutRepeat = (str) => {
  if (str.length === 1) return 1;
  if (str.length === 0) return 0;
  let set = new Set();
  let max = 0;
  let left = 0;

  for (let i = 0; i < str.length; i++) {
    while (set.has(str[i])) {
      set.delete(str[left]);
      left++;
    }
    set.add(str[i]);
    max = Math.max(max, i - left + 1);

    console.log(set);
  }
  return max;
};

console.log(longetstSubWithoutRepeat("abcabcd"));
