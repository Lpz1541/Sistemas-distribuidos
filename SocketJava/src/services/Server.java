package services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Server extends Connection{

	public Server() throws IOException {
		super("server");
	}

	public void onServer() throws ClassNotFoundException, IOException {
		System.out.println("Server> Running...");

		try {
			while(true) {
				System.out.println("Server> Waiting...");

				s = ss.accept();

				System.out.println("Server> Client online...");
				

				BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));


				while((message = input.readLine()) != null){
					System.out.println("Client> "+message);
				}

				System.out.println("Server> Client offline...");

			}

		} catch (IOException e) {
			ss.close();
			System.out.println("Server> "+e.getMessage());
		}		

	}
}
