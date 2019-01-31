/*
* Problem Description : A program to generate 'n' number of prime numbers, where 'n' is an integer input taken by user.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : This program Accepts an Integer 'n' from user and Iterates 'n' number of times to print 'n' number of prime numbers starting from 2.
*        if 'n' is greater than or equal to 1
*            first prime number, 2 will be printed
*
*       then it will iterate for rest of the numbers since 2 is the smallest prime number.
*
*        Set 'status' to true(Status will tell about the number being a prime or not)
*        Set 'count' to 2(Since we have already printed '2' as the first prime number)
*        Set 'num' to 3(Since we have to start from 3 for printing rest primes)
*        
*        While 'count' is less than or equal to 'n'
*
*           Set 'j' iterator to 2
*               While 'j' is less than or equal to Square root of 'num'
*                   if 'num' is divisible by 'j' or not (This will tell if the number has more factors than, 1 or the number itself)//Condition for prime number.
*                       value of status will be false, telling that this is not a prime number.
*                       then break the loop
*               end loop here....
*                                           
*                   if status is false after coming out of loop
*                       then that number is printed as the next prime number.
*                        and value of count is increased by one.
*
*                   
*                       status = true
*                       and num is increased by one for next iteration.
*       end loop here....
*
*/

//Code Here...

import java.util.*;

public class S9
{
    public static void main(String args[])
    {
        int num = 3, count, j;

        boolean status = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of prime numbers you wish to print : ");
        int n = in.nextInt();
        
        if (n >= 1)
        {
            System.out.println("First "+n+" prime numbers are:");
            System.out.println(2);
        }
        
        for (count = 2; count <= n;)
        {
            for (j = 2; j <= Math.sqrt(num); j++)//Loop to iterate till the number's square root to find another factor other than 1 or the number itself.
            {
                if (num % j == 0)
                {
                    status = false;// Tells about the status of prime number, if 0 then not prime, if 1 then prime
                    break;
                }
            }
            
            if (status)
            {
                System.out.println(num);
                count++;
            }
            
            status = true;
            num++;
        }       
    }
}