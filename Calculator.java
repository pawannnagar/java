import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
int n1,n2,ch,cal;                                                                                                                            
System.out.println("entertwo number");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
System.out.println("select operation[1,2,3,4]");
ch=sc.nextInt();
if(ch==1)
{
cal=n1+n2;
System.out.println("Addition:"+cal);
}
else if(ch==2)
{
cal=n1-n2;
System.out.println("substraction:"+cal);
}
else if(ch==3)
{
cal=n1*n2;
System.out.println("multiplication:"+cal);
}
else if(ch==4)
{
cal=n1/n2;
System.out.println("division:"+cal);
}
else
{
cal=n1%n2;
System.out.println("modulus:"+cal);
}
}
}