/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var throttle = function(fn, t) {
    let timeId=null;
    let storedArgs=null;

    function callWithStoredArgs(){
        if(storedArgs){
            fn.apply(null,storedArgs);
            storedArgs=null;
            timeId=setTimeout(callWithStoredArgs,t);
        } else{
            timeId=null;
        }
    }
  return function(...args) {
      if(!timeId){
          fn.apply(null,args);
          timeId=setTimeout(callWithStoredArgs,t);
      }else{
          storedArgs=args;
      }
  }
};

/**
 * const throttled = throttle(console.log, 100);
 * throttled("log"); // logged immediately.
 * throttled("log"); // logged at t=100ms.
 */