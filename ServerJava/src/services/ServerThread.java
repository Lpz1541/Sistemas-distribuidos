package services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;

public class ServerThread extends Thread{

	private Socket s;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	private int idClient;
	


	public ServerThread(Socket s, int idClient) throws IOException {
		this.s = s;
		this.idClient = idClient;
		ois = new ObjectInputStream(s.getInputStream());
		oos = new ObjectOutputStream(s.getOutputStream());
		
	}

	@Override
	public void run() {

		try {
			
			
			Persona persona = new Persona();
			System.out.println("Server> Create object person "+ persona);
			
			persona = (Persona)ois.readObject();
			
			System.out.println("Server> Consulta object person of client "+ persona);
			
			
			oos.writeObject("Procesado");
			
			//s.close();


		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Server> "+e.getMessage());
		}		


	}



}
