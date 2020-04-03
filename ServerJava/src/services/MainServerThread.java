package services;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerThread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Server> Running...");
		
		ServerSocket ss = new ServerSocket(1234);
		
		int idClient = 0;
		while(true) {
			
			Socket s = new Socket();
			
			s = ss.accept();
			System.out.println("Server> Init client...");
			
			ServerThread serverThread = new ServerThread(s, idClient);
			serverThread.start();
			idClient ++;
			
		}
	}

}
