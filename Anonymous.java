package Anonymous;

public abstract class Person {
	abstract void ma();
}

 class Annonymous{
	 public static void main(String args[]) {
	
	Person pr=new Person(){
		void ma()
		{System.out.print("oops");}
	};
	
	 pr.ma();
 }
 }
