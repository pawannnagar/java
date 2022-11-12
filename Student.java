class Student
{
int rollno=100;   //instance variable
String name ="csd";
public static void main(String args[])
{
Student s=new Student();
Student s1=new Student();
s.rollno=300;
s1.name="code";
System.out.println(s.rollno);
System.out.println(s.name);
System.out.println(s1.rollno);
System.out.println(s1.name);
}
}  //instance variable is known AS Object level variale 