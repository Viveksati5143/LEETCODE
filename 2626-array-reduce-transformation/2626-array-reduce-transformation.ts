type Fn = (accum: number, curr: number) => number

function reduce(arr: number[], fn: Fn, initialVal: number): number {
  let accumulator = initialVal;
  for (const element of arr) {
      accumulator = fn(accumulator, element);
  }
  return accumulator;
};