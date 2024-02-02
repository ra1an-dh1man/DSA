import java.util.Scanner;

public class EvenWord 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        scn.close();

        String[] wrd = str.split(" ");

        for(String res : wrd)
        {
            if(res.length() % 2 == 0)
                System.out.println(res);
        }
    }
    
}
