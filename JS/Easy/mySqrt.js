function sqrt(x) {
    if (x < 0) throw new Error("Input cannot be negative");
    if (x < 2) return x;
    let left = 0;
    let right = x;

    while (right >= left) {
        let middle = Math.floor((left + right) / 2);
        if (middle * middle === x) return middle;
        else if (middle * middle < x)
            left = middle + 1;
        else right = middle - 1;
    }

    return right;
}

// Example 
console.log(sqrt(4));
console.log(sqrt(8));