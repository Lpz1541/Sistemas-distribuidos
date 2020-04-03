package services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Client extends Connection{

	public Client() throws IOException {
		super("client");
	}
	
	public void onClient(String client) throws ClassNotFoundException {
		System.out.println(client+"> Running..");
		
		try {
			//BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//String st = in.readLine();
			//if( st != null ) System.out.println("Server> " + st ); 
			
			outputServer = new DataOutputStream(s.getOutputStream());
			
			System.out.println(client+"> Sending data to server");
			
            for (int i = 0; i < 2; i++)
            {
            	outputServer.writeUTF(client + "> Mensaje número " + (i+1) + "\n");
            }
            
            System.out.println(client+"> Data sent...");
            
            outputServer.flush();
            
			System.out.println(client+"> Stop...");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
