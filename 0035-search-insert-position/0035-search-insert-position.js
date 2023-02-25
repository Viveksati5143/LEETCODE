var searchInsert = function(nums, target) {
    let s = 0, e = nums.length;
    while(s < e) { 
        let m = s + Math.floor((e-s)/2); 
        if (target > nums[m]) s = m + 1
        else e = m
    }
    return s;
};