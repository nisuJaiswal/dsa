const maxProfit = (prices) => {
  let minVal = Number.MAX_VALUE;
  let maxProfit = 0;

  for (let i = 0; i < prices.length; i++) {
    minVal = Math.min(minVal, prices[i]);
    maxProfit = Math.max(maxProfit, prices[i] - minVal);
  }

  return maxProfit;
};
console.log(maxProfit([7, 1, 5, 3, 6, 4]));
