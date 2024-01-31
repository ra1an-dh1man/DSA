import java.util.Scanner;

public class QuadEquation 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();

        System.out.println(a + "x^2 " + b + "x " + c);

        Quadratic(a, b, c);
    }    

    static void Quadratic(int a, int b, int c)
    {
        int d = (int)Math.pow(b, 2) - (4 * a * c);
        
        if(d >= 0)
        {
            double root1 = (-b + (double)Math.sqrt(d) ) / (2 * a);
            double root2 = (-b - (double)Math.sqrt(d) ) / (2 * a);
            System.out.println("First root of the quadratic equation is:" + root1 );
            System.out.println("Second root of the quadratic equation is:" + root2 );
        }
        else
        {
            d = d * -1;
            double realpart = - b / (2 * a);
            double imgpart = (double)Math.sqrt(d);

            System.out.println(realpart + " + " + imgpart + "i");
            System.out.println(realpart + " - " + imgpart + "i");

        }
        

    }
}
