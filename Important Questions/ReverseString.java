/*
    Java program to print a sentence in reverse with provided that 
    if the spaces between two words are more than two it must be reduced to one. 
*/
import java.util.Scanner;

public class ReverseStringSpace 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        String[] str2 = str.split("\\s+");

        for(int i = str2.length - 1; i >= 0; i--)
        {
            System.out.print(str2[i] + " ");
        } 
    }
    
}
