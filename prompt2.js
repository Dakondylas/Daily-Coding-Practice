// Dillon Kondylas
// Prompt 2
// 01/29/2025

while (true) {
    let userInput = prompt("Please enter a sequence of numbers, not seperated by anything, to be summed: ");
    if (isNaN(userInput) == false) {
        let finalNum = 0;
        let numString = userInput[0];
        for (x = 0; x < userInput.length; x++) {
            finalNum += Number(userInput[x]);
        }
        for (x = 1; x < (userInput.length - 1); x++) {
            numString += (", " + userInput[x]);
        }
        if (userInput.length > 2) {
            numString += (", and " + userInput[userInput.length-1]);
        } else {
            numString += (" and " + userInput[userInput.length-1]);
        }
        console.log("The sum of " + numString + " is " + finalNum);
        break;
    } else {
        console.log("\nTry again...\n\n");
    }
}
