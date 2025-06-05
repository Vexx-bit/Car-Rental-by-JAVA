import java.util.Scanner;
public class LAND 
{
Scanner BSE=new Scanner (System.in);    
int Size;
String Location;
void CaptureData()
{
System.out.println("Enter location=");
Location=BSE.nextLine();
System.out.println("Enter Size=");
Size=BSE.nextInt();
}
}
class TRANSACTION extends LAND
{
double Price, Discount;
void Agreement()
{
 CaptureData(); 
System.out.println("Enter Price=");
Price=BSE.nextDouble();
System.out.println("Enter Discount in %=");
Discount=BSE.nextDouble();
}
}
class PAYMENT extends TRANSACTION
{
  double PayableAmount;
  int ModeOfPayment;
 void Finalize()
 {
Agreement();
PayableAmount=Price-(Price*Discount*0.01);
System.out.println("Enter ModeOfPayment 1(BANK) 2(CASH) 3(MPESA)");
ModeOfPayment=BSE.nextInt();
System.out.println("*OUTPUT*");
System.out.println("Location="+Location);
System.out.println("Size="+Size);
System.out.println("Price="+Price);
System.out.println("Discount given="+(Price*Discount*0.01));
System.out.println("PayableAmount="+PayableAmount);
System.out.println("ModeOfPayment="+ModeOfPayment);
}
    public static void main(String[] args) 
    {
    PAYMENT client=new PAYMENT();
    client.Finalize();
    }
    
}