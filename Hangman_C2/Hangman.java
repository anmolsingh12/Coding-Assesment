import java.util.*;

public class Hangman
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String secret ="";
        int size;

        ArrayList<Character> arr = new ArrayList<Character>();

        boolean contains = false;

        System.out.println("Welcome to Hangman for computer!");
        System.out.println("You have to enter a word and computer will randomly generate letters to guess that word.");

        System.out.println("Enter the Secret Word!!");
        secret = in.nextLine();
        size = secret.length();
        char sec[] = secret.toLowerCase().toCharArray();
        int wrongNum = 0;
        int correctNum = 0;

        for(int i = 0; i < size; i++)
        {
            arr.add(sec[i]);
        }

        while(!arr.isEmpty())
        {
            char guess = generateRandom();
		    
            if(arr.contains(guess))
            {
                System.out.println("Correct Letter, Letter "+guess+" exists in the given word.");
                arr.remove(Character.valueOf(guess));
                size = arr.size();
                correctNum++;
            }

            else
            {
                wrongNum++;
            }
        }
        if(arr.isEmpty())
        {
            System.out.println("Correct Guesses : "+correctNum);
            System.out.println("Wrong Guesses : "+wrongNum);
        }        
}

    public static char generateRandom()
    {
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return c;
    }
}