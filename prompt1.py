# Dillon Kondylas
# 01/29/2025
# pallendrome challenge

userInput = input("Please input a word to check if it's a pallendrome: ").lower()

reversedWord = ""
for x in range(len(userInput)):
    reversedWord += userInput[-(x + 1)]

if (reversedWord == userInput):
    print("\n\nThe word is a pallendrome!")
    print(userInput, "spelled backwards is", reversedWord + "!")
else:
    print("\n\nThe words are not pallendromes.\n")
    print(userInput, "spelled backwards is", reversedWord + ".")