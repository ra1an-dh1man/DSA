/*
    Program to to print output as the middle value of the string. If the string is even size
    then the it must give output as the two middle value of the string. 
 */
import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(show(str));
        
    }

    public static String show(String str)
    {
        if(str == null || str.length() == 0)
            return "Please Input valid string";
        
        if(str.length() % 2 == 0)
        {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
        else
            return Character.toString(str.charAt(str.length() / 2));   
    }
    
}
