const chocolateDistribute = (chocolates, students, numOfChocolates) => {
  if (!chocolates || !students) return -1;
  if (chocolates < students) return -1;

  chocolates = chocolates.sort((a, b) => a - b);
  //   console.log(chocolates);
  let minDifference = Number.MAX_VALUE;

  for (let i = 0; i + students - 1 < numOfChocolates; i++) {
    if (chocolates[i + students - 1] - chocolates[i] < minDifference) {
      minDifference = chocolates[i + students - 1] - chocolates[i];
      //   console.log(minDifference);
    }
  }
  return minDifference;
};

const arr = [12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50];
console.log("Minimum Difference: ", chocolateDistribute(arr, 7, arr.length));
