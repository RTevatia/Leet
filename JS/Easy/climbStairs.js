function climbStairs(steps) {
    if (steps <= 2) return steps;
    let a = 1;
    let b = 2;

    for (let i = 3; i <= steps; i++) {
        let temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}

console.log(climbStairs(5));