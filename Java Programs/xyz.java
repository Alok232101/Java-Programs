   class B{
    int b=6;
    }
    interface C{
    int c=5;
    };
    class A extends B implements C{
    int a=8;
    void show()
    {
    System.out.println(a+""+b+""+c);
    }
    }
    class xyz {
    public static void main(String args[])
    {
    A p=new A();
    p.show();
    }
    
    }
    
 