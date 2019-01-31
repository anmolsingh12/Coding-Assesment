/*
* Problem Description : Program that converts an entered Sentence to Pig Latin by putting first letter of each word at its last and adding ay at the ned of it.
*
* Author : Anmol Singh
* Date : 23rd jan 2019
*
* Pseudocode : 
*
*/

import java.util.*;
public class S7
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String [] words;
        String inp = "";
        System.out.println("Enter the English Sentence that you wish to get converted into Pig Latin : ");
        inp = in.nextLine();

        String newWord = "";
        words = inp.split(" ");
        int i = 0;
        for(String word : words)
        {
            newWord = convertToPigLatin(word).toLowerCase();
            words[i] = newWord;
            i++;
        }

        for(String word : words)
        {
            System.out.print(word+" ");
        }
    }

    public static String convertToPigLatin(String word)
    {
        String newWord = "";
        newWord = word.substring(1) + word.substring(0,1);
        return newWord+"ay";
    }
}