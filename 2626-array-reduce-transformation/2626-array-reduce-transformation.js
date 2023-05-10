/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(arr, fn, initialVal) {
  let accumulator = initialVal;
  for (const element of arr) {
      accumulator = fn(accumulator, element);
  }
  return accumulator;
};