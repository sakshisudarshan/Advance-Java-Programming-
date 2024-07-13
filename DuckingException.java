class A
{
  public void show () throws ClassNotFoundException
  {
	Class.forName ("demo");

  }
}
public class Main
{
  public static void main (String[]args)
  {
	A obj = new A ();
	  try
	{
	  obj.show ();
	}

	catch (ClassNotFoundException e)
	{
	  System.out.println ("Class not found");
	}

  }
}
