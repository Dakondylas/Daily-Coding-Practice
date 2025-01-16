# Dillon Kondylas
# CSC 120
# 01/16/2025

import random

amtNum = random.randrange(1, 16)
print(amtNum)
numberList = []
for x in range(amtNum):
    numberList.append(x+1)
print("\n", numberList)
numberList.remove(random.choice(numberList))
print("\n", numberList)

def absentNumFind(numberList):
    if numberList == []:
        numberList.append(1)
    elif numberList[0] != 1:
        numberList.insert(0, 1)
    else:
        listLen = len(numberList)
        lastDigit = numberList[-1]
        if listLen == lastDigit:
            numberList.append((numberList[-1]) + 1)
        else:
            for x in range(lastDigit):
                if (x+1) != numberList[x]:
                    numberList.insert(x, x+1)
                    break

absentNumFind(numberList)
print("\n\n", numberList)
