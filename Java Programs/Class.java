public class Class {
    public static void main(String args[])
    {
        class temp{
            String nm;
            int marks;
            temp(){
            nm="ramesh";
            marks=354;
            }
            void show(){
            System.out.println(nm+" "+marks);
            }
            }
            class xyz{
            public static void main(String args[]){
            
            temp p= new temp();
            p.show();
            }
            }
    }
    
}
