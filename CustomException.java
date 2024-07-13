class SException extends Exception
{
  public SException (String str)
  {
	super (str);
  }
}

public class Main
{
  public static void main (String[]args)
  {
	int i = 20;
	int j = 0;

	  try
	{
	  j = 18 / i;
	  if (j == 0)
		throw new SException ("I dont want to print zero");

	}

	catch (SException e)
	{
	  j = 18 / 1;
	  System.out.println ("this is the default output " + e);
	}


	catch (Exception e)
	{
	  System.out.println ("Something went wrong");
	}

	System.out.println (j);

  }
}
