import java.util.*;
public class fibonnaci {
    public static void main(String[] args)
        {
            int p=0,c=1,n,i,N;
            System.out.println("Enter the value of n : ");
            Scanner sc=new Scanner(System.in);
            N=sc.nextInt();                                             
            System.out.print("0\t1\t");
            for(i=0;i<N-2;i++)
            {
                n=p+c;
                p=c;
                c=n;
                System.out.print("\t"+n);
        }
    
}
}
