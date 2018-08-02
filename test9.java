class NoDefExp extends Exception
{
	
NoDefExp(String str)
{
	System.out.println(str);
}
}
class test9
{
public static void main(String args[])
{
try
{
	String s=new String("");

s=s.concat("ssss ");
System.out.println(s+"a");
if(s !=null)
{
	System.out.println("thorwn");
throw new NoDefExp("Creating user defined Exception");
}
}

catch(NoDefExp de)
{
de.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("Baap");
}

}
}
