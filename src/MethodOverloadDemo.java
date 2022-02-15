import java.util.Scanner;

public class MethodOverloadDemo {
public void name(String fname,String lname)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name");
	fname=sc.next();
	System.out.println("Enter last name");
	lname=sc.next();
	System.out.println("Full name is "+fname +" "+lname);
	
	
}
public void name(String nickname)
{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter nickname");
	nickname=sc1.next();
	System.out.println("Nick name is "+nickname);
}

public static void main(String[] args) {
	MethodOverloadDemo mod=new MethodOverloadDemo();
	mod.name(null, null);
	mod.name(null);
}
}
