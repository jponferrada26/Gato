package gato;
import utiles.Menu;
import utiles.Teclado;
public class TestGato {
	public static void main(String[] args) {
		Menu menu = new Menu("MENU GATO",new String[]{"-Despertar","-Dormir","-Jugar","-Comer","-Hablar","-Salir"});
		Gato gato = new Gato(Teclado.leerEntero("Peso(gr):"),Teclado.leerCadena("Nombre:"),Teclado.leerCadena("Raza:"));
		int opcion;
		do{
			opcion =menu.gestionar(); 
			gestionarMenu(opcion,gato);
		}while(opcion != 6 );
		
		
	}
	
	private static void gestionarMenu(int opcion,Gato gato){
		switch(opcion){
		case 1: System.out.println(gato.despertar());
			break;
		case 2: System.out.println(gato.dormir());
			break;
		case 3: System.out.println(gato.jugar());
			break;
		case 4: System.out.println(gato.comer());
			break;
		case 5: System.out.println(gato.toString());
			break;
		case 6:
			break;
		}
	}

}
