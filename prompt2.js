// Dillon Kondylas
// Prompt 2
// 01/29/2025
 
let userInput = prompt("Please enter a sequence of numbers, not seperated by anything, to be summed: ");
 
function sequenceSum(userInput) {
// used a while true loop... go ahead and give me the 0... to repeat until the user successfully enters only numeric input
    while (true) {
        if (isNaN(userInput) == false) {
            let finalNum = 0;
            // I could have made this code way shorter but I wanted the output to have the numbers entered by the user seperated by commas and with the and and oxford comma and actually no commas if there are only two numbers and blah blah blah....
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
            // The final print statement
            console.log("The sum of " + numString + " is " + finalNum);
            break;
        } else {
            // repeats the prompt if the user failed to input correctly
            console.log("\nTry again...\n\n");
            userInput = prompt("Please enter a sequence of numbers, not seperated by anything, to be summed: ");
        }
    }
}
  
sequenceSum(userInput);