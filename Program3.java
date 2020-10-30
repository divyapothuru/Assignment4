package lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		Bankaccount e = new Bankaccount("divya", "123", "kadapa",1000);
		oos.writeObject(e);
		e.display();
		System.out.println(" serialized");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data1.txt"));
		Bankaccount e1 = (Bankaccount) ois.readObject();
			e1.display();
			System.out.println("deserialized");
	}
}
