package CONSOLECLASS;
import java.io.Console;
public class ConsoleClassExample1
{
	public static void main(String args[])
	{
		String str;
		Console con=System.console();
		//creating object for console class
		if(con==null)
		{
			System.out.println("No console available");
			return;
		}
		str=con.readLine("Eneter your name");
		System.out.print(str);
		System.out.println("Enter password: ");
		char[] ch=con.readPassword();
		String pass=String.copyValueOf(ch);
		System.out.println("Password is: "+pass);
	}

}
