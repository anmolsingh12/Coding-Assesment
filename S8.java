/*
* Problem Description : Program that prints next 20 leap years.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : presentYear variable telling about the ongoing year
*               count variable to count 20 years and stop the code
*               checkLeapYear(int year)
*                   Checks if the given year is a leap year or not
*               
*               infinite while loop to iterate all years, starting from presentYear.
*                   if checkLeapYear returns true
*                       count is increased by one and the year is printed
*                   else if count is equal to 20
*                       break the loop and terminate the program.
*
*/

import java.util.*;
public class S8
{
    public static boolean checkLeapYear(int year)
    {
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }
    
    public static void main(String [] args)
    {
        int presentYear = 2019;
        int count = 0;
        for( int i = presentYear; ;i++)
        {
            if(checkLeapYear(i))// Checks whether the iterating year is a leap year or not
            {
                count++;
                System.out.println(i+" ");
            }

            else if(count == 20)
                break;
        }
    }
}