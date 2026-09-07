var isPalindrome = function(inputNumber) {
    const reverseString = inputNumber.toString().split("").reverse().join("");
    return reverseString == inputNumber.toString();
};

console.log(109, isPalindrome(109));