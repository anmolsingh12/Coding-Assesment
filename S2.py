"""
* Problem Description : Program that takes input a multi digit number and prints the digits of the number as list.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : num is input taken from user as a string
*               listOfDigits is filled by iterating the input string as array of characters and each element is picked and put into list as Integers 
"""
num = input("Enter a number : ")

listOfDigits = []

for i in num:
    listOfDigits.append(int(i))

print(listOfDigits)
