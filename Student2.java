class Student2
{
static String cname="cpt";
}
class Student3
{
public static void main(String args[])
{
System.out.println(cname);
Student2 s=new Student2();
System.out.println(s.cname);
System.out.println(Student2.cname);
}
}