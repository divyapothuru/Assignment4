package lab4;

import java.io.IOException;

public class Program7 {
public static void main(String[] args)
{
	Throwingexce te=new Throwingexce();
	try {
		te.throwException();
	} catch (InputException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
/*As we are throwing 2 exceptions 
 * we must handle those 2 exceptions by using catch block*/
