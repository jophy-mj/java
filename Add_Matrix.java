import java.util.Scanner;
public class Add_Matrix
{
public static void main(String[] args)
{
int p,q;
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements in first matrix:");
p=s.nextInt();
System.out.print("Enter no of columns in first matrix:");
q=s.nextInt();
int a[][]=new int[p][q];
System.out.println("Enter all ements:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
System.out.print(a[i][j]+"");
}
System.out.print("");
}
}
}