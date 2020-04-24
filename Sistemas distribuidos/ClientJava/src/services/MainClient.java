package services;

import java.io.IOException;
import java.util.Random;

public class MainClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Client> running");
		
        for (int i = 1; i <= 2; i++) {
        	Client client = new Client(i);
    		client.start();
		}
	}
}
