function filter(arr: number[], fn: (n: number, i: number) => any): number[] {
    const newArr: number[] = [];
    for (let i = 0; i < arr.length; ++i) {
        if (fn(arr[i], i)) {
            newArr.push(arr[i]);
        }
    }
    return newArr;
};