/**
 * @param {any} o1
 * @param {any} o2
 * @return {boolean}
 */
var areDeeplyEqual = function(o1, o2) {
    const type1 = typeof(o1);
    const type2 = typeof(o2);
    const isArray1 = Array.isArray(o1);
    const isArray2 = Array.isArray(o2);

    if((type1 !== type2) || (isArray1 !== isArray2)) return false;

    if((type1 !== 'object') || (o1 === null)) return o1 === o2;

    if(isArray1){
      if(o1.length !== o2.length) return false;
      for(let i=0;i<o1.length;i++){
        if(!areDeeplyEqual(o1[i],o2[i])) return false;
      }
    }

    const key1 = Object.keys(o1);
    const key2 = Object.keys(o2);
    if(key1.length !== key2.length) return false;
    for(let i=0;i<key1.length;i++){
      if(!areDeeplyEqual(o1[key1[i]],o2[key1[i]])) return false;
    }
    return true;
};