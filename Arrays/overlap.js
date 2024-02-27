class Interval {
  constructor(start, end) {
    this.start = start;
    this.end = end;
  }
}

function compareInterval(a, b) {
  return a.start < b.start;
}

function mergeIntervals(arr) {
  if (arr.length <= 0) return;

  let stack = [];

  arr.sort(compareInterval);

  stack.push(arr[0]);

  for (let i = 1; i < arr.length; i++) {
    let top = stack[stack.length - 1];
    if (top.end < arr[i].start) s.push(arr[i]);
    else if (top.end < arr[i].end) {
      top.end = arr[i].end;
      stack.pop();
      stack.push(top);
    }
  }

  console.log("The Merged Intervals are: ");
  while (stack.length > 0) {
    let t = stack.pop();
    console.log("[" + t.start + "," + t.end + "] ");
  }
  return;
}

// Driver program
let arr = [
  new Interval(6, 8),
  new Interval(1, 9),
  new Interval(2, 4),
  new Interval(4, 7),
];
mergeIntervals(arr);
