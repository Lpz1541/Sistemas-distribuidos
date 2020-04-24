package services;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Random;

import data.Empleado;
import data.Estudiante;
import data.Persona;

public class Client extends Thread{
	
	protected Socket s;
	
	private final int PORT = 1234;
	private final String HOST = "localhost";
	
	protected ObjectOutputStream oos;
    protected ObjectInputStream ois;
    private int idCliente;
    
	public Client(int idCliente){
		this.idCliente=idCliente;
	}
	
	
	@Override
	public void run() {
		try {
			this.onClient(this.idCliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.run();
	}



	public void onClient(int idClient) throws ClassNotFoundException {

		try {
	        
	        Random random = new Random();
            int numeroRandom=random.nextInt(101);
	        
	        	Random random2 = new Random();
	            int numeroRandom2=random2.nextInt(3);

	            for (int i = 0; i < numeroRandom; i++) {
	            	s = new Socket(HOST, PORT);
	    			
	    			oos = new ObjectOutputStream(s.getOutputStream());
	    	        ois = new ObjectInputStream(s.getInputStream());
	    	        
	            switch (numeroRandom2) {
				case 0:{
					Persona persona = new Persona(1, "Diego", 21, "M");
					System.out.println("Client " + idClient + "> send object "+persona);
					oos.writeObject(persona);
					break;
				}
				case 1:{
					Empleado empleado = new Empleado(2, "Hawer", 30, "M", "Docente", "24/04/2020", 4.000);
					System.out.println("Client " + idClient + "> send object "+empleado);
					oos.writeObject(empleado);
					break;
				}
				case 2:{
					Estudiante estudiante = new Estudiante(3, "Camila", 20, "F",9901, "Sistemas", "23/01/2020");
					System.out.println("Client  " + idClient + "> send object "+estudiante);
					oos.writeObject(estudiante);
					break;
				}

				default:
					break;
				}
	            System.out.println((String)ois.readObject());
	            
		}
			
			ois.close();
			oos.close();
			
			s.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

