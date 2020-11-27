#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    # if n % 2 != 0:
    #     print("Weird")
    # else:
    #     if n>=2 and n<=5:
    #         print("Not weird")
    #     elif  n>=6 and n >=20:
    #         print("Weird")
    #     elif  n>20:
    #         print("Not Weird")

    check = {True: "Not Weird", False: "Weird"}

    print(check [ n % 2 == 0 and (n in range (2,6) or n>20)])


    a = int(input())
    b = int(input())

    print(a/b)
    print(a//b)


 	n = int(input())
    
    i=0
    while i < n:
        print(i*i)
        i+=1


    #leap year
def is_leap(year):
    # leap = False
    
    # Write your logic here
    # if year % 4 == 0:
    # 	if year % 100:
    # 		if year % 400:
				# leap = True
    # 	elif
    # 	leap = False
    # else 
    # 	leap = False

    return year % 4 == 0 and (year % 400 == 0 or year % 100 !=0)
    
    # return leap

year = int(input())
print(is_leap(year))