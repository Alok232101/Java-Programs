public class Reverse {
    public static void main(String args[])
    {
        int n=123;
        int r1,r2,r3;
        int q1,q2;
        r1=n%10;
        q1=n/10;
        n=q1;
        r2=n%10;
        q2=n/10;
        n=q2;
        r3=n%10;
       System.out.println("reverse = " +r1+r2+r3);
    }
    
}
