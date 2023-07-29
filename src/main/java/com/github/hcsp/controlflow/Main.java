// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class PrimeNumbersinRange {
    public static boolean isPrime(int n)
{
    int cnt=0;
    for(int i=1; i<=n; i++)
    {
        if(n%i==0)
        {
            cnt++;
        }
    }
    return cnt==2;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the ending range : ");
        int eR=in.nextInt();
        System.out.println();
        for(int i=1; i<=eR; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
