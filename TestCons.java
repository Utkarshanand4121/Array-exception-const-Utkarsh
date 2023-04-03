 class Test {

	public Test() {
		System.out.println("Hi from Constructor body");
		

	}
    public Test(int a,int b) {
    	int c=a+b;
    	System.out.println(c);
    }
}
 public class TestCons {
	 public static void main(String[] args) {
		 new Test(12,13);
	 }
 }
