package services;

import java.io.IOException;

public class MainServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Server server = new Server();
		server.onServer();
	}
}
