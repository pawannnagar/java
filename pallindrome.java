import java.util.*;
class Pallindrome
{
public static void main(String args[])
{
String original,reverse="";//objects of String class
Scanner in=new Scanner(System.in);
System.out.println("Enter a String to check if its a pallindrome");
original=in.nextLine();
int length=original.length();
for(int i=length-1;i>=0;i--)