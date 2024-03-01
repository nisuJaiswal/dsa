const isAnagram = (one, two) => {
  if (one.length !== two.length) return false;

  let collection = {};

  for (let el in one) {
    collection[one[el]] = collection[one[el]] + 1 || 1;
  }

  for (let el in two) {
    if (!collection[two[el]]) return false;
    collection[two[el]]--;
  }

  return true;
};

console.log(isAnagram("aabc", "baac"));
