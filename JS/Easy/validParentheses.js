let isValid = function(s) {
    let stack = []
    const mapping = new Map();
    mapping.set(')', '(');
    mapping.set('}', '{');
    mapping.set(']', '[');

    for (char of s) {
        if ("({[".includes(char))
            stack.push(char);
        else if (")}]".includes(char)) {
            if (stack.length !== 0 && stack[stack.length - 1] !== mapping.get(char))
                return false;
            stack.pop();
        }
    }

    return stack.length === 0;
}

const s1 = "()";
console.log(isValid(s1));

const s2 = "()[]{}";
console.log(isValid(s2));

const s3 = "(]";
console.log(isValid(s3));

const s4 = "([])";
console.log(isValid(s4));

const s5 = "([)]";
console.log(isValid(s5));