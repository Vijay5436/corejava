package inheritance;

public class ObjectClass {
	static int last_roll=100;
	int roll_no;
	
	//Constructor
ObjectClass()
{
	roll_no=last_roll;
	last_roll++;
}

//Overriding hashCode()
@Override
public int hashCode()
{
	return roll_no;
}
//Driver code
public static void main(String args[])
{
	ObjectClass s=new ObjectClass();
	//Bellow two statements are equivalent
	System.out.println(s);
	System.out.println(s.toString());
	Object obj=new String("mass");
	Class c=obj.getClass();
	System.out.println("Class of object is : "+c.getName());
	s=null;
	System.gc();
	//garbagecollection
}
@Override
protected void finalize()
{
	System.out.println("finalized method class");
	
			
}
}
