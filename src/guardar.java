import java.util.Scanner;
import java.security.SecureRandom;
import java.util.List;

public class guardar {

	private static Scanner sc;

	public static void main(String[] args) {
		List<cliente> liUsua;
		Metodos d = new Metodos();
		cliente p = new cliente();
		sc = new Scanner(System.in);
		String Curp;
		do {

			System.out.println("\nBienvenidos a INE\n\n-- Opciones:\n" + "1) Crear cuenta " + "\n2) Consultar" + "////////////////////////////////////////////////");
			int ans = sc.nextInt();

			if (ans == 1) {
				// CREAR CUENTA
				
				System.out.println("Nombre:");
				p.setNombre(sc.next());
				System.out.println("Ape pat:");
				p.setApellidoPPersona(sc.next());
				System.out.println("Ape mat:");
				p.setApellidoMPersona(sc.next());
				System.out.println("Domicilio:");
				p.setDomicilio(sc.next());
				System.out.println("Clavelector:");
				p.setClavelector(sc.nextInt());
				System.out.println("Curp:");
				p.setCurp(sc.next());
				Curp = sc.nextLine();
				System.out.println("Estado:");
				p.setEstado(sc.next());
				System.out.println("Localidad:");
				p.setLocalidad(sc.next());
				System.out.println("Municipio:");
				p.setMunicipio(sc.next());
				System.out.println("Emision:");
				p.setEmision(sc.next());
				System.out.println("Seccion:");
				p.setSeccion(sc.nextInt());
				System.out.println("Vigencia:");
				p.setVigencia(sc.nextInt());
				System.out.println("AñoRegistro:");
				p.setAñoRegistro(sc.nextInt());
				System.out.println("FechaDeNacimiento:");
				p.setFechaDeNacimiento(sc.nextInt());
				System.out.println("Sexo:");
				p.setSexo(sc.next());
				d.insertarRegistro(p);
				//System.out.println(p);
				/*
				p.setCurp(Curp);
				p = d.seleccionarPersona(p);
				
				liUsua = d.seleccionarPersonas();
				for(cliente usuario : liUsua) {
					if(usuario.getCurp() == Curp) {
						System.out.println(usuario);
					}
				}
				*/
			} else if (ans == 2) {
				// CONSULTAR CUENTA
				System.out.println("Curp:");
				p.setCurp(sc.next());
				p = d.seleccionarPersona(p);
				System.out.println(p);
				System.out.println(p.getApellidoMPersona());
			} else if (ans == 3) {
				

			
			}

		} 

		while (true);

		

	}

}
