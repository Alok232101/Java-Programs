interface A{
    int a=5;
    }
    interface B extends A{
    int b=7;
    }
    interface C extends B{
    int c=9;
    }
    class D implements A,B,C{
    int d=3;
    void show()
    {
    System.out.println(a+""+b+""+c+""+d);
    }
    }
    class temp{
    public static void main(String args[])
    {
    D p=new D();
    p.show();
    
    }
    }
