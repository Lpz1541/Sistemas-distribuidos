package services;

import java.io.IOException;

public class MainClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		for(int i =0; i<10; i++)
		{
			Client client = new Client();
			client.onClient("Client new "+i);
		}
		
	}
}
