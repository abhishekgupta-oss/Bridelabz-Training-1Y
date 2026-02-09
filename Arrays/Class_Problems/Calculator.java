class Calculator{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		int sum=c1.add(10,20);
		System.out.println(sum);
		Calculator c2=new Calculator();
		int sub=c2.sub(20,10);
		System.out.println(sub);
		Calculator c3=new Calculator();
		int mul=c2.mul(20,10);
		System.out.println(mul);
		Calculator c4=new Calculator();
		int div=c4.div(20,10);
		System.out.println(div);
	}
	
}