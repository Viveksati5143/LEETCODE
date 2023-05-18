var TimeLimitedCache = function() {
    this.cache = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const expirationTime = now + duration;
    if (this.cache.has(key)) {
        const entry = this.cache.get(key);
        entry.value = value;
        entry.expirationTime = expirationTime;
        return true;
    } else {
        this.cache.set(key, { value: value, expirationTime: expirationTime });
        return false;
    }
};

/** 
 * @param {number} key
 * @return {number} value associated with key, or -1 if expired or not found
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();
    if (this.cache.has(key)) {
        const entry = this.cache.get(key);
        if (entry.expirationTime < now) {
            this.cache.delete(key);
            return -1;
        } else return entry.value;
    } else return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let count = 0;
    for (const entry of this.cache.values()) {
        if (entry.expirationTime >= now) {
            count++;
        }
    }
    return count;
};