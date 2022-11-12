class  Test
{
	public static void main(String[] args) 
	{
		Test t =new Test();
		t.add();
		t.add(10);
		t.add(10,20);
		t.add(10,20,30,40,50);

		
	}


	void add(int...a)
	{
		System.out.println("csd");
	}
}
