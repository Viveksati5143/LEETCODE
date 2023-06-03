/**
 * @param {Array} arr
 * @return {Generator}
 */
function* inorderTraversal(arr) {
  for (const element of arr) {
    if (Array.isArray(element)) yield* inorderTraversal(element);
    else yield element;
  }
}

/**
 * const gen = inorderTraversal([1, [2, 3]]);
 * gen.next().value; // 1
 * gen.next().value; // 2
 * gen.next().value; // 3
 */