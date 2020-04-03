package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread{

	private String message;
	private Socket s;
	private int idClient;



	public ServerThread(Socket s, int idClient) {
		this.s = s;
		this.idClient = idClient;
	}

	@Override
	public void run() {

		try {

			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));

			int suma = 0;
			if(idClient == 3) {
				for(int i=0; i<10000000; i++) {
					suma ++;
				}
			}

			while((message = input.readLine()) != null){
				System.out.println("Client> "+message);
			}

			s.close();



		} catch (IOException e) {
			System.out.println("Server> "+e.getMessage());
		}		


	}



}
