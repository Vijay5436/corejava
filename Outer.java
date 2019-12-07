class Outer 
{
	private int data=50;		
	class methodInner
	{ 
		void displayInner()
		{
			System.out.print("fun "+data);
		}
	}
	public static void main(String args[])
	{
		Outer out=new Outer();
		Outer.methodInner obj=out.new methodInner();
		obj.displayInner();
	}
}