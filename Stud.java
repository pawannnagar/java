class Stud
{
String name="csd";
static String cname="cpt";
public static void main(String[] args)
{
Stud s=new Stud();
Stud s1=new Stud();
System.out.println(s.name);
System.out.println(s.cname);
System.out.println(s1.name);
System.out.println(s1.cname);

s1.name="pawan";
s.cname="code";
System.out.println(s.name);
System.out.println(s.cname);
System.out.println(s1.name);
System.out.println(s1.cname);
}
}