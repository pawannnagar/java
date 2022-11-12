class  Test
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.add(10,20,30,40);

	}
	void add(int...a)
	{
		int total=0;
		for(int ele :a)
		{
			total=total+ele;
		}
		System.out.println(total);
	}
}
