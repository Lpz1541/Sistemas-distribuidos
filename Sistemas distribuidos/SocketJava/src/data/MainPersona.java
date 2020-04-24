package data;

public class MainPersona {

	public MainPersona() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setIdentificacion(1072394576);
		persona1.setNombre("Hawer");
		
		System.out.println(persona1);
		System.out.println(persona1.getIdentificacion());
		
	}

}
