package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerThread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Server> Running...");
		ServerSocket ss = new ServerSocket(1234);
		int idClient = 0;
		while(true) {
			System.out.println("Server> Waiting...");
			
			Socket s = new Socket();
			
			s = ss.accept();
			
			ServerThread serverThread = new ServerThread(s, idClient);
			serverThread.start();
			idClient ++;
			
		}


	}

}
