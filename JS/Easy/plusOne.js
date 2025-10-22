var plusOne = function(digits) {
    for (var i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) { 
            digits[i] += 1;
            return digits
        }
        digits[i] = 0;
    }
    return [1] + digits;
}

digits1 = [1, 2, 3];
digits2 = [4, 3, 2, 1];
digits3 = [9];

console.log(plusOne(digits1));
console.log(plusOne(digits2));
console.log(plusOne(digits3));