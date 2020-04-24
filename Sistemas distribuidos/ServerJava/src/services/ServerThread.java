package services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Empleado;
import data.Estudiante;
import data.Persona;

public class ServerThread extends Thread{

	protected Socket s;
	protected ObjectInputStream ois;
	protected ObjectOutputStream oos;

	private int idClient;

	public ServerThread(Socket s, int idClient){
		this.s = s;
		this.idClient = idClient;
		
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		do {
			try {
				Persona persona = new Persona();
				persona = (Persona)ois.readObject();
				System.out.println("Server> "+persona);
				oos.writeObject("Server> Object recived");
				try {s.close();} catch (IOException e) {e.printStackTrace();}
			} catch (Exception e) {
				try {
					Empleado empleado = new Empleado();
					empleado = (Empleado)ois.readObject();
					System.out.println("Server> "+empleado);
					oos.writeObject("Server> Object recived");
					try {s.close();} catch (IOException e2) {e2.printStackTrace();}
				} catch (Exception e2) {
					try {
						Estudiante estudiante = new Estudiante();
						estudiante = (Estudiante)ois.readObject();
						System.out.println("Server> "+estudiante);
						oos.writeObject("Server> Object recived");
						try {s.close();} catch (IOException e3) {e3.printStackTrace();}
					} catch (Exception e3) {
						break;
					}
				}
			}
				
		}while(true);
	
	}
}
