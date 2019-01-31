/*
* Problem Description : Program that prints number of secouds from 1970.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : System.currentTimeMillis gives us the miliseconds from Unix Epoch Time, 
*               long seconds will be equal to System.currentTimeMillis divided by 1000.
*               print seconds
*/

import java.util.*;

public class S5
{
    public static void main( String[] args)
    {
        long seconds = System.currentTimeMillis() / 1000l;
        System.out.println("\nSeconds since 1970: "+seconds+"\n");
    }
}