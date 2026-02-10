// find the mode of an array of numbers
function findMode(numbers) {
    const frequency = {};
    let maxFreq = 0;
    let modes = [];

    // count the frequency of each number
    numbers.forEach((num) => {
        frequency[num] = (frequency[num] || 0) + 1;
        if (frequency[num] > maxFreq) {
            maxFreq = frequency[num];
        }
    });

    // extract numbers that match the maximum frequency
    for (const num in frequency) {
        if (frequency[num] === maxFreq) {
            modes.push(Number(num));
        }
    }

    return modes;
}

//  find the median of an array of numbers
function findMedian(numbers) {
    numbers.sort((a, b) => a - b); // Sort the numbers
    const mid = Math.floor(numbers.length / 2);

    if (numbers.length % 2 === 0) {
        // if even return the average of the two middle numbers
        return (numbers[mid - 1] + numbers[mid]) / 2;
    } else {
        // If odd, return the middle number
        return numbers[mid];
    }
}


