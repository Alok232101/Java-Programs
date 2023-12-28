class temp2
{
public static void main(String args[])
{
    try{
char ch;
int age=89;
char x[]={'r','a','m'};
char y[]={'k','u','m','a','r'};
byte a[]={65,78,99,72,55,63,78};
String p=new String (x);
String q=new String(a,2,5);
String s=new String(y);


System.out.println(p);

System.out.println(a);
System.out.println(p.length());
System.out.println(p+s);
System.out.println(s.trim());
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
//System.out.println(s.reverse());

System.out.println(s.charAt(2));
System.out.println(s.replace('a','m'));
System.out.println(s.equals(p));
System.out.println(s.equalsIgnoreCase(p));
System.out.println(s.indexOf('a'));
System.out.println(s.compareTo(p));
System.out.println(s.substring(2,4));
System.out.println(s.substring(2));
StringBuffer m =new StringBuffer(50);
m.append("he is of age").append(age);
System.out.println(m);
m.insert(9,"about");
System.out.println(m);
m.delete(5,10);

System.out.println(m);
m.deleteCharAt(2);
System.out.println(m);
    }catch(Exception e){}




}
}