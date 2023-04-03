
package first;

class Test
{
	public void show()
	{
		System.out.println("Hi from method");
	}
}
public class TestObject {
	public static void main(String[] args) {
		Test xyz=new Test();  //allocate memory
		xyz.show();
		System.out.println("HI from main");
	}

}
