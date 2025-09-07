class Solution {
    isPalindromeStr(x) {
        const str = x.toString();
        return str === [...str].reverse().join('');
    }

    isPalindromeInt(x) {
        if (x < 0) return false;

        let originalX = x;
        let reversedX = 0;

        while (x > 0) {
            const digit = x % 10;
            reversedX = reversedX * 10 + digit;
            x = Math.floor(x / 10);
        }

        return originalX === reversedX
    }
}

function main() {
    const solution = new Solution();
    const num1 = 121;
    const num2 = 125;
    
    console.log(solution.isPalindromeStr(num1));
    console.log(solution.isPalindromeStr(num2));

    console.log(solution.isPalindromeInt(num1));
    console.log(solution.isPalindromeInt(num2));
}

main();