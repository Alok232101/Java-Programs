import java.util.*;
public class SOD {
    public static void main(String args[])
    {
        int n,r,q,s=0;
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            q=n/10;
            n=q;
            s=s+r;
        }
        System.out.println("Sum of digir is = " +s);
    }
    
}
