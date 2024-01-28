import java.util.Scanner;

public class WordsCount 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        System.out.println(Count(str));

    }

    public static int Count(String str)
    {
        int count = 1;
        if(str == null || str.length() == 0)
            return -1;

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == ' ')
                count++;
        }
        
        return count;
    }
    
}
