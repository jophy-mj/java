import java.util.Scanner;
public class Count_occur
{
public static void main(String args[])
{
int n,x,count=0,i=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the element you want to count:");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
count++;
}
}
System.out.println("No: of occurance of element:"+count);
}
}