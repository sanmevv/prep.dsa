a = int(input("num1 : \n"))
b = int(input("num2 : \n"))

maxNum = max(a,b)
while(True):
    if(maxNum % a == 0 and maxNum % b == 0):
        break
    maxNum = maxNum + 1

print(f"the LCM of {a} and {b} is {maxNum}")