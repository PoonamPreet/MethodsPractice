import java.util.Scanner;

public class CallValueDemo {
	int val=0;
	int operation(int val)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		val=sc.nextInt();
		val=val*10/100;
		return(val);
	}
	public static void main(String[] args) {
		CallValueDemo cd=new CallValueDemo();
		
		
		//System.out.println("Value is "+cd.val);
		cd.operation(100);
		System.out.println("Updated value is "+cd.val);
	}
	
}
