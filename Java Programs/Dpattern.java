public class Dpattern {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
             if(j==4-i || j==2+i || j==8-i || i*j==8)
             System.out.print("*");
             else
             System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
}
