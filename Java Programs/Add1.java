import java.util.*;
class Add{
    int x,y,z;
    void getData(){
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the no");
            x=sc.nextInt();
            y=sc.nextInt();
        

    }
    void sum(){
        z=x+y;
    }
    void display(){
        System.out.println("Adition ="+z);
    }
}
class Add1{
    public static void main(String alok[])
    {
        Add obj=new Add();
        obj.getData();
        obj.sum();
        obj.display();
        
    }
}