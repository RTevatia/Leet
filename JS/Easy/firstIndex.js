let firstIndex = function(haystack, needle) {
    return haystack.indexOf(needle);
}

let main = function() {
    // Example 1
    let haystack1 = 'sadbutsad';
    let needle1 = 'but';
    console.log(firstIndex(haystack1, needle1));

    // Example 2
    let haystack2 = 'leetcode';
    let needle2 = 'leeto';
    console.log(firstIndex(haystack2, needle2));
}

main();