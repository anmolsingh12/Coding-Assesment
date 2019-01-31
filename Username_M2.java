import java.util.*;
import java.util.regex.*;
import java.lang.*;

public class Username_M2
{
    public static boolean checkAlphaNumeric(String username)
    {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!@#$]*$");
        Matcher matcher = pattern.matcher(username);
        boolean hasSpecialChars = matcher.find();
        if(hasSpecialChars)
            return true;
        
        else
            return false;
    }

    public static boolean checkFirstAlphabetCase(String username)
    {
        char ch[] = username.toCharArray();
        
        if(Character.isUpperCase(ch[0]))
            return true;
        else
            return false;
    }

    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        String username = "";

        boolean check1 = false;
        boolean check2 = false;

        System.out.println("Enter Your Username");
        username = in.nextLine();

        check1 = checkFirstAlphabetCase(username);

        check2 = checkAlphaNumeric(username);
        if(check1 && check2)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}