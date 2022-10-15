import sys
import os

workingdirectory = os.getcwd()
print("number of arguments:", len(sys.argv), "arguments.")
print("argument list:", str(sys.argv))

def addition():
    print(sys.argv[1])
    num1 = sys.argv[1]
    num2 = sys.argv[2]
    numbers =[num1,num2]
    print(numbers)
    sumof = int(num1) + int(num2)
    print("sum of {0} and {1} is {2}".format(num1,num2,sumof))

addition()



