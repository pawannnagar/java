class Student1
{
static String cname="cpt";
public static void main(String args[])
{
System.out.println(cname);
Student1 s = new Student1();
System.out.println(s.cname);
System.out.println(Student1.cname);
}
}