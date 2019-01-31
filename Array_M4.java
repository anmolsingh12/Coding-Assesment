import java.util.*;
public class Array_M4
{

    public static int checkMissingElement(int a[])
    {
        int size = a.length;
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i < size; i++)
        {
            sum1 += i;
        }

        for(int i = 0; i < size; i++)
        {
            sum2 += a[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return sum1 - sum2;
    }

    public static void main(String args[])
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        n = in.nextInt();

        int a[] = new int[n -1];
        System.out.println("Enter Distinct Array Elements from 1 to "+n);

        for(int i = 0; i < a.length; i++)
        {
            a[i] = in.nextInt();
        }

        // for(int i = 0; i < a.length; i++)
        // {
        //     System.out.println(a[i]);
        // }

        int miss = checkMissingElement(a);
    }
}