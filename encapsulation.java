import java.util.Scanner;
class Class71_encaps {
	String name;
	String address;
	String email;
	int phno;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setphno(int phno)
	{
		this.phno=phno;
	}
	public String getname()
	{
		return this.name;
	}
	public String getaddress()
	{
		return this.address;
	}
	public String getemail()
	{
		return this.email;
	}
	public int  getphno()
	{
		return this.phno;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		Class71_encaps obj=new Class71_encaps();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User Details");	
			System.out.println("Enter  user name");	
			 String name=s.next();
			 obj.setname(name);
			    System.out.println("Enter address");	
				 String address=s.next();
				 obj.setaddress(address);
					System.out.println("Enter email");	
					 String email=s.next();
					 obj.setemail(email);
					 System.out.println("Enter Phone Number");	
					  int phno=s.nextInt();
					  obj.setphno(phno);
					  //user details
						System.out.println("\n***User Details***");	
							System.out.println("Name:"+obj.getname());
							System.out.println("Address:"+obj.getaddress());
							System.out.println("Email:"+obj.getemail());
							System.out.println("Contact Number:"+obj.getphno());
	}
}