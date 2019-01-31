"""
* Problem Description : Program that takes first list as a list of characters and second list as list of numbers, then both the lists are added and displayed.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : List one is taken as input(characters Only) = l1
*               List two is taken as input(Numbers Only) = l2
*               l3 = l1 + l2
*               print l3
"""

input_string1 = input("Enter First Character list element separated by space ")
l1  = input_string1.split()

input2 = [int(x) for x in input("Enter Second Integer list elements separated by space ").split()]

l2  = input2

l3 = l1 + l2

print(l3)