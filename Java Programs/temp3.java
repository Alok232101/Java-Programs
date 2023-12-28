class temp3
{
public static void main(String args[])
{
char ch;
StringBuffer k=new StringBuffer();
try{ // put whole program into try block to handle all esxceptions.
do{
ch=(char)System.in.read(); //this program is to read charatacter from th console(keyboard)
k.append(ch); //character that is input inserted into string character wise.

}while(ch!='\n'); //loop will continue until enter press.to form a string of charcters.
System.out.println(k);

}catch(Exception e){} // no error will show



}
}
