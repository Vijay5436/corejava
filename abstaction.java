public class abstaction {
	public static void main(String[] args) {
		Racoon racoon=new Racoon("Racoon");
		racoon.eat();
		racoon.breath();
	}
}
abstract class Animal
{
	private String name;
	public Animal(String name)
	{
		this.name=name;
	}
	public abstract void eat();
	public abstract void breath();
	public String getname()
	{
		return name;
	}
}
	class Racoon extends Animal
	{
		public Racoon (String name)
		{
			super(name);
		}
		public void eat()
		{
			System.out.println(getname()+" is eating");
		}
		public void breath()
		{
			System.out.println("Breath in,Breath out,repeat");
		}
}