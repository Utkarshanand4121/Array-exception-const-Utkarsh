 import java.util.Scanner;
public class TextExcep {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number");
    int a,b,c;
    try {
    	a=scanner.nextInt();
    	b=scanner.nextInt();
    	c=a/b;
    	System.out.println(c);
    	
    }
    catch (Exception e) {
    	System.out.println("Please do proper input");
    	
    }
	}

}
