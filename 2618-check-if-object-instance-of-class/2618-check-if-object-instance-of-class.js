/**
 * @param {any} obj
 * @param {any} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function (obj, classFunction) {
  if (obj === null || obj === undefined || typeof classFunction !== "function")
    return false;

  let inputObj = obj;
  if (typeof obj !== "object") inputObj = Object(obj);
  return inputObj instanceof classFunction;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */