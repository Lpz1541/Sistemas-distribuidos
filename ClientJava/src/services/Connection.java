package services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {
	
	private final int PORT = 1234;
	private final String HOST = "localhost";
	
	protected ServerSocket ss;
	protected Socket s;
	
	//Comunicación con Objetos
	protected ObjectInputStream ois;
	protected ObjectOutputStream oos;

	
	protected String message;

	public Connection(String type) throws IOException {
		
		if(type.equalsIgnoreCase("server")) {
			ss = new ServerSocket(PORT);
			s = new Socket();
		}
		else {
			s = new Socket(HOST, PORT);
		}
	}
}
