//abstract class
//it is super class, made for inheritence only.


abstract class A{
abstract void show();
}

class B extends A{
void show()
{
System.out.println(" Hello how are you.");
}
}
class C extends A
{
void show()
{
    System.out.println(" Welcome to Ashoka Hotel");
}
}
class D extends A
{
void show()
{
    System.out.println(" Welcome to Mayur Hotel");
}
}
class E extends A
{
void show()
{
    System.out.println(" Welcome to Egle Hotel");
}
}
class temp8
{
public static void main(String args[])
{

B p=new B();
p.show();
C q=new C();
q.show();
D d=new D();
d.show();
E e=new E();
e.show();
}
}