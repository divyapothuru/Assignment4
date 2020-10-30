package lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
    	 BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
    	 String name = br.readLine();
		
    	 BufferedWriter bw;
		 bw = new BufferedWriter(new FileWriter("name.txt"));
    	 bw.write(name);
    	 System.out.println(name);
    	 br.close();
    	 bw.close();
	}
}
