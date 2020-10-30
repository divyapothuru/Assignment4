package lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		int count=0;
		try {
		FileInputStream fi=new FileInputStream("C:\\Users\\DELL\\Desktop\\execution\\lab4\\src\\lab4\\Data");
		while((count=fi.read())!=-1)
		{
			System.out.print((char)count);
		}
		}catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
