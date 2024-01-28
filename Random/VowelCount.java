import java.util.Scanner;

public class VowelCount 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        

        int count = 0;

        for(int i=0 ; i < str.length() ; i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
                count++;
        }
        System.out.println("total number of vowels in the sentence are: " + count);
        scn.close();
    }
}
