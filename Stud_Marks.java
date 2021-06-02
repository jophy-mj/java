import java.util.Scanner;
public class Stud_Marks
{
public static void main(String[] args) 
{
float sub1,sub2,sub3,sub4,sub5;
double total,percentage;
Scanner s = new Scanner(System.in);
System.out.println("Enter marks of 5 subjects");
System.out.println("Enter mark of sub1 out of 100:");
sub1=s.nextFloat();
System.out.println("Enter mark of sub2 out of 100:");
sub2=s.nextFloat();
System.out.println("Enter mark of sub3 out of 100:");
sub3=s.nextFloat();
System.out.println("Enter mark of sub4 out of 100:");
sub4=s.nextFloat();
System.out.println("Enter mark of sub5 out of 100:");
sub5=s.nextFloat();
total=sub1+sub2+sub3+sub4+sub5;
percentage=(total/500)*100;
System.out.println("Total marks="+total);
System.out.println("Percentage="+percentage);
}
}