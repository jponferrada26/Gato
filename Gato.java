/**
 * 
 */
package Gato;

/**
 * @author Grupo Javier, Guillermo, Pablo, Rafael, Soledad
 * @version 2.0
 *
 */
public class Gato {
	private int peso;// el peso lo consideramos en gramos.
	private String nombre;
	private String raza;
	private boolean dormido;// por defecto, está dormido.
	private static final int MAXPESO = 15000;
	private static final int SOBREPESO = 10000;
	private static final int ENCLENQUE = 1500;
	private static final int MINPESO = 500;

	/**
	 * @param peso
	 * @param nombre
	 * @param raza
	 * @param dormido
	 */
	public Gato(int peso, String nombre, String raza) {
		setPeso(peso);
		setNombre(nombre);
		setRaza(raza);
		setDormido(true);
	}

	/**
	 * @return the peso
	 */
	private int getPeso() {
		return peso;
	}

	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @return the raza
	 */
	private String getRaza() {
		return raza;
	}

	/**
	 * @return the dormido
	 */
	private boolean isDormido() {
		return dormido;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	private void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param raza
	 *            the raza to set
	 */
	private void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	 * @param dormido
	 *            the dormido to set
	 */
	private void setDormido(boolean dormido) {
		this.dormido = dormido;
	}

	// Comportamientos.

	String comer() {
		String cadena = "";
		if (!comprobarMuerto()) {
			if (isDormido() == false) {
				if (getPeso() >= SOBREPESO) {
					cadena += "Voy a reventar";
					setPeso(getPeso() + 500);
				} else if (getPeso() <= ENCLENQUE) {
					cadena += "Tengo hambre";
					setPeso(getPeso() + 500);
				} else {
					cadena += "\n Rico, rico";
					setPeso(getPeso() + 500);
				}
			} else
				cadena = "Estoy dormido";
		} else
			cadena = "Tu gato esta muerto";

		return cadena;
	}

	String jugar() {
		String cadena = "";
		if (!comprobarMuerto()) {
			if (isDormido() == false) {
				if (getPeso() >= SOBREPESO) {
					cadena += "Voy a reventar";
					setPeso(getPeso() - 500);
				} else if (getPeso() <= ENCLENQUE) {
					cadena += "Tengo hambre";
					setPeso(getPeso() - 500);
				} else {
					cadena += "\n Qué diver...";
					setPeso(getPeso() - 500);
				}
			} else
				cadena = "Estoy dormido";
		} else
			cadena = "Tu gato esta muerto";

		return cadena;
	}

	String dormir() {
		if (!comprobarMuerto()) {
			if (isDormido() == false) {
				setDormido(true);
				return "RrrrrrRRrr ZZZZZzzzzz";
			}else
				return "Tu gato ya esta dormido.";
		}else
			return "Tu gato esta muerto."; 

	}

	String despertar() {
		if (!comprobarMuerto()) {
			if (isDormido() == true) {
				setDormido(false);
				return "Miaauuuu";
			}else
				return "Tu gato ya esta despierto.";
		}else
			return "Tu gato esta muerto."; 
		
	}

	boolean comprobarMuerto() {
		if (getPeso() >= MAXPESO || getPeso() <= MINPESO) {
			return true;
		}
		return false;
	}

}
