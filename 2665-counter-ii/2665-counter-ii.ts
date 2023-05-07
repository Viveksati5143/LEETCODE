type ReturnObj = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): ReturnObj {
    let currentCount = init;
    
    function increment() {
        return ++currentCount;
    }
    
    function decrement() {
        return --currentCount;
    }
    
    function reset() {
        return (currentCount = init);
    }
    return { increment, decrement, reset };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */