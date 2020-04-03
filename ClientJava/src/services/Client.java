package services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Persona;

public class Client extends Connection{

	public Client() throws IOException {
		super("client");
	}
	
	public void onClient(int client) throws ClassNotFoundException {
		
		try {
			
			Persona persona = new Persona(client, "Hawer", 30, "M");
			System.out.println(persona);
			
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			
			oos.writeObject(persona);
			System.out.println(ois.readObject());
			
			//ois.close();
			//oos.close();
					
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
