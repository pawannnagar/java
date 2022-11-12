class Student4
{
String name = "csd";
static String cname="cpt";
public static void main(String args[])
{
Student4 s=new Student4();
Student4 s1=new Student4();
System.out.println(s.name);
System.out.println(s.cname);
System.out.println(s1.name);
System.out.println(s1.cname);
s1.name="chandrapal";
s.cname="code";
System.out.println(s.name);
System.out.println(s.cname);
System.out.println(s1.name);
System.out.println(s1.cname);
}
}
