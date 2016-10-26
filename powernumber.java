import java.io.*;
import java.util.*;
class powernumber
{
int r=0;
void powerof2(int n)
{
for(int i=n;n>0;i++)
{
 if(n%2!=0)
  {
    r++;
  }
  n=n/2;
}
if(r>1)
  {
    System.out.println("The given number is not power of 2");
  }
else
  {
    System.out.println("The given number is power of 2");
  }

}

public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n;
powernumber p=new powernumber();
System.out.println("Enter the number:");
n=sc.nextInt();
p.powerof2(n);
}
}
