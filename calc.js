// add two numbers
function add(a, b) {
    return a + b;
}

// subtract two numbers
function subtract(a, b) {
    return a - b;
}

// multiply two numbers
function multiply(a, b) {
    return a * b;
}

// divide two numbers
function divide(a, b) {
    if (b === 0) {
        throw new Error("cant divide by zero");
    }
    return a / b;
}

// calculate power
function power(base, exponent) {
    return Math.pow(base, exponent);
}

// calculate square root
function squareRoot(a) {
    if (a < 0) {
        throw new Error("cant calculate square root of a negative number");
    }
    return Math.sqrt(a);
}



