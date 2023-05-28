/**
 * @param {Function} fn
 * @return {Array}
 */
Array.prototype.groupBy = function(fn) {
  const returnObject = {};
  for (const item of this) {
    const key = fn(item);
    if (key in returnObject) returnObject[key].push(item);
    else returnObject[key] = [item];
  }
  return returnObject;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */