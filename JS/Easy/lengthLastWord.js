var lengthLastWord = function(s) {
    var i = s.length - 1;
    var length = 0;

    // Skip trailing spaces
    while (i >= 0 && s[i] === ' ') {
        i--;
    }

    // Count the length of the last word
    while (i >= 0 && s[i] !== ' ') {
        length++;
        i--;
    }

    return length
}

// Examples
s1 = "Hello World"
s2 = "   fly me   to   the moon  "
s3 = "luffy is still joyboy"

console.log(lengthLastWord(s1))
console.log(lengthLastWord(s2))
console.log(lengthLastWord(s3))