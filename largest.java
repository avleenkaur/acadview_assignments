import java.util.Scanner;
class largest
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter three numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>c)
{
if(a>b)
{
System.out.println("a is largest");
}
else
{
System.out.println("b is largest");
}
}
else
{
System.out.println("c is largest");
}
}
}

