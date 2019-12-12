
import java.util.Scanner;
public class reg {	
String name;
String address;
String contactNumber;
String email;
String proofType;
String proofID;
public reg(String name, String address, String contactNumber, String email, String proofType, String proofID)
{
this.name=name;
       this.address=address;
       this.contactNumber=contactNumber;
       this.email=email;
       this.proofType=proofType;
       this.proofID=proofID;
}
public static void main(String[] args)	
{	
Scanner s=new Scanner(System.in);
System.out.println("REGISTRATION");
System.out.print("Enter your name: ");
String name=s.nextLine();
System.out.print("Enter your address: ");
String address=s.nextLine();
System.out.print("Contact Number: ");
String contactNumber=s.nextLine();
System.out.print("E-Mail ID: ");
String email=s.nextLine();
System.out.print("Enter proof type: ");
String proofType=s.nextLine();
System.out.print("Enter proof id: ");
String proofID=s.nextLine();
reg obj=new reg(name,address,contactNumber,email,proofType,proofID);	
obj.Register(name,address,contactNumber,email,proofType,proofID);
}	
static void Register(String n, String ad, String con, String mail, String proo, String pID)
{
int c=1;
System.out.println("Thank you for registering. Your id is "+c+"...");	
}	
}

