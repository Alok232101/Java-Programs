public class Star2 {
    public static void main(String args[])
    {
        int i,j;
for(i=1;i<=3;i++)
{
    for(j=1;j<=19;j++)
    {
        if((j>=4-i&&j<=6+i)||(j>=14-i&&j<=16+i))
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.print("\n");
}
for(i=1;i<=1;i++)
{
    for(j=1;j<=14;j++)
    {
        if(j>=8-i&&j<=8-i)
        System.out.print("MySirG");
        else
        System.out.print("*");
    }
    System.out.print("\n");
}
for(i=1;i<=9;i++)
{
    for(j=1;j<=19;j++)
    {
        if(j>=i+1&&j<=19-i)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.print("\n");
    }
}

    
}
