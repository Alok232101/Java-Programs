import java.util.Scanner;
public class LabelTrader{
public static int sum(int number) {
int sum = 0;
while (number > 0 || sum > 9) {
if (number == 0) {
number = sum;
sum = 0;
}
sum += number % 10;
number /= 10;
}
return sum;
}
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int number;
System.out.println("===========================");
System.out.println("Reg no : 12220300 NAME : ALOK KUMAR GUPTA ");
System.out.println("Enter the number :");
number= sc.nextInt();
System.out.println("The number on the box will be :"+
sum(number)); 
}
}
