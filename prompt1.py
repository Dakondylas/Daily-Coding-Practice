# Dillon Kondylas
# 01/29/2025
# palindrome challenge
 
 
userInput = input("Please input a word to check if it's a palindrome: ")
reversedWord = [""]
def palindromeChecker(userInput):
    userInput = userInput.lower()
    # adds the letters in userInput to a seperate string in reverse order starting with the last index
    for x in range(len(userInput)):
        reversedWord[0] += userInput[-(x + 1)]
    
    # Outputs the results to the output terminal depending on if the reversed string is the same as the inputted string
    if (reversedWord[0] == userInput):
        return True
    else:
        return False

if (palindromeChecker(userInput)):
    print("\n\nThe word is a palindrome!")
    print(userInput, "spelled backwards is", reversedWord[0], "!")
else:
    print("\n\nThe words are not palindromes.\n")
    print(userInput, "spelled backwards is", reversedWord[0], ".")