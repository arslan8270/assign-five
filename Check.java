import java.util.Scaner
public class Check
{
public static void main(String[] args);
Scaner obj=new Scaner(System.in);
System.out.println("Enter your slary");
int sal=obj.nextInt();
if(sal>=1000)
{
int b=(sal*10)/100;
sla=sla+b;
}
System.out.println("Total sal"+sal);
}
}