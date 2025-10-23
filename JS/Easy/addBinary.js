function addBinary(a, b) {
    return (parseInt(a, 2) + parseInt(b, 2)).toString(2);
}

// Example usage
console.log(addBinary("11", "1"));
console.log(addBinary("1010", "1011"));