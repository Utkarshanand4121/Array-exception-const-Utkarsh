package first;

class Test1
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}

class Test2
{
	public void subtract()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
	}
}

public class secondclass {
	public static void main (String[] args) {
		Test1 xyz=new Test1();
		xyz.add();
		Test2 test=new Test2();
		test.subtract();
		System.out.println("Hi from main");
	}
}

