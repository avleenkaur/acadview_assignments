import java.util.Scanner;
class add
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter two numbers");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is=" +sum);
	}
}