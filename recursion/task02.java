 package second;
import java.util.Scanner;

public class task02
{
    public static void main(String[] args) 
    {
        int n, mul;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        task02 obj = new task02();
        mul = obj.fact(n);
        System.out.println("Factorial of "+n+" :"+mul);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}
