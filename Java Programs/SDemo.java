import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MulJF extends JFrame implements ActionListener
{
 JPanel p;
 JTextField t1,t2;
 JLabel lb1,lb2,lb3,lb4,lb5,lb6;
 JButton b1;
 public MulJF() 
 {
 p=new JPanel();
 p.setBounds(0,0,1000,2000);
 p.setLayout(null);
 setContentPane(p);
 lb1=new JLabel("Num 1 :");
 lb2=new JLabel("Num 2 :");
 lb3=new JLabel("Result :");
 lb4=new JLabel("");
 lb5=new JLabel("");
 lb6=new JLabel("");
 t1=new JTextField();
 t2=new JTextField();
 b1=new JButton("Calculate");
 //b2=new JButton("Addition");
 lb1.setBounds(10,10,50,30);
 t1.setBounds(120,10,100,30);
 lb2.setBounds(10,50,50,30);
 t2.setBounds(120,50,100,30);
 b1.setBounds(120,100,100,30);
 //b2.setBounds(250,100,100,30);
 lb3.setBounds(120,140,100,30);
 lb4.setBounds(220,140,100,30);
 lb5.setBounds(300,140,100,30);
 lb6.setBounds(400,140,100,30);
 p.add(lb1);
 p.add(lb2);
 p.add(lb3);
 p.add(lb4);
 p.add(lb5);
 p.add(lb6);
 p.add(t1);
 p.add(t2);
 p.add(b1);
 //p.add(b2);
 b1.addActionListener(this);
 //b2.addActionListener(this);
 setVisible(true);
 setSize(500,400);
 setTitle("Calaculator Frame");
 setLayout(null);
 setResizable(false);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e)
 {
    int n1=Integer.parseInt(t1.getText());
    int n2=Integer.parseInt(t2.getText());
    int res=n1*n2;
    int res1=n1+n2;
    int res2=n1-n2;
    float res3=n1%n2;
    lb3.setText("Multiplicaion :" +res);
    lb4.setText("Addition :" +res1);
    lb5.setText("Subtraction :" +res2);
    lb6.setText("Division :" +res3);
 }

}
class SDemo
{
    public static void main(String args[])
    {
        MulJF obj=new MulJF();
    }
}