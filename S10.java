import java.util.*;
/*
* Problem Statement : User inputs an Integer and Sum is printed from 0 to that ineteger.
* Author : Anmol Singh
* Date : 23rd jan 2019
* Pseudocode : n is the input variable
*               printSum(n) is called
*               printSum starts.....
*                   sum is 0 initially
*                   while n is not equal to 0
*                       sum = sum + n
*                       and n is decremented by one
*                   while ends here....
*                   return sum
*               printSum ends......
*               
*               Result from printSum() is printed finally as the Answer
*                   print "Sum of the numbers from 0 to "+n+" is : "+sum
*/

public class S10
{
    static int printSum(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer : ");

        int n = in.nextInt();
        int sum = printSum(n);

        System.out.println("Sum of the numbers from 0 to "+n+" is : "+sum);
    }
}