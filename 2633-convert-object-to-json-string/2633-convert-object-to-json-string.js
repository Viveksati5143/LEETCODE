/**
 * @param {any} object
 * @return {string}
 */
var jsonStringify = function(object) {
    if (typeof object === 'string') return '"' + object + '"';
    else if (typeof object === 'number' || typeof object === 'boolean' || object === null) return String(object);
    else if (Array.isArray(object)) {
        var arrayStr = '[';
        for (var i = 0; i < object.length; i++) {
          if (i > 0) {
            arrayStr += ',';
          }
          arrayStr += jsonStringify(object[i]);
        }
        arrayStr += ']';
        return arrayStr;
    } 
    else if (typeof object === 'object') {
        var objStr = '{';
        var keys = Object.keys(object);
        for (var j = 0; j < keys.length; j++) {
            var key = keys[j];
            if (j > 0) objStr += ',';
            
            objStr += '"' + key + '":' + jsonStringify(object[key]);
        }
        objStr += '}';
        return objStr;
    }
};