class  Test
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1(10);
		t.m1(10,20);
		t.m1(10,29,30,40);

	}
	void m1(int a,int...x)
	{
		System.out.println("pawan");
	}
    void m1(int p,int q)
	{
		System.out.println("nagar");
	}


}
