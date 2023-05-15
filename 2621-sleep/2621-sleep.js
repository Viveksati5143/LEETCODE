/**
 * @param {number} millis
 */
async function sleep(millis) {
  return new Promise((delayresolve, reject) => {
    if (typeof millis !== 'number' || isNaN(millis)) {
      reject(new Error('Invalid argument. Expected a number.'));
    } else {
      setTimeout(delayresolve, millis);
    }
  });
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */