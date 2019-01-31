import java.io.*;  
public class Password_C3 
{
    public static void main(String[] args) {
		BufferedReader reader;
        int min = 0, max = 0;
        int numberOfAllowedNumericChars = 0, numberOfAllowedSpecialChars = 0;
        String[] defaultPasswords = new String[10];
        String [] allowedPattern = new String[3];      
        //Reading Configuration File
		try {
			reader = new BufferedReader(new FileReader("D://Anmol//Password_C3//input.txt"));
            
            String line = reader.readLine();
            int i = 0, j = 0;
			while (line != null) {
                if( i == 0)
                {
                    max = Integer.parseInt(line);
                }

                else if(i == 1)
                {
                    min = Integer.parseInt(line);
                }                

                else if(i == 2||i == 3||i==4)
                {
                    allowedPattern[j] = line;
                    j++;
                }

                else if(i == 5)
                {
                    numberOfAllowedSpecialChars = Integer.parseInt(line);
                }

                else if(i == 6)
                {
                    numberOfAllowedNumericChars = Integer.parseInt(line);
                }

                else if(i == 7)
                {
                    defaultPasswords = line.split("//s");
                }

        		line = reader.readLine(); 
                i++;       
            }
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

        System.out.println("max : "+max+" min : "+min+" numberOfAllowedNumericChars : "+numberOfAllowedNumericChars+" numberOfAllowedSpecialChars : "+numberOfAllowedSpecialChars);

        for(String w:allowedPattern)
        {
            System.out.println(w);
        }

        for(String w:defaultPasswords)
        {
            System.out.println(w);
        }
	}
}