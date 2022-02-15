import java.util.Scanner;

public class MethodExecutionDemo {
	
	public int multiplynumbers(int a,int b)
	{
		System.out.println("Multiplication of a & b is ");
		 int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		MethodExecutionDemo med=new MethodExecutionDemo();
		Scanner sc=new Scanner(System.in);
		 int y = 0;
		 int z =0;
		 
		System.out.println("Enter the value of a : ");
		y=sc.nextInt();
		System.out.println("Enter the value of b : ");
		z=sc.nextInt();
		
		int x=med.multiplynumbers(y, z);
		System.out.print(x);
	}

}
