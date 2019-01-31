/*
* Problem Description : A program to delete all matching elements in an array
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : 
*/

import java.util.*;

public class S3
{
    public static ArrayList<Integer> checkList(ArrayList<Integer> list) 
    { 
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int element:list)
        {
            if (!newList.contains(element)) 
                newList.add(element); 
        }
        return newList; 
    } 

    public static void main(String [] args)
    {
        int size = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        ArrayList<Integer> newArrlist = new ArrayList<Integer>();

        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(5);
        arrlist.add(6);

        newArrlist = checkList(arrlist);

        System.out.println(newArrlist);
    }
}
