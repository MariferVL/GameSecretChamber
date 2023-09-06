package com.unab;

import java.util.Scanner;

/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static Scanner scanner = new Scanner(System.in);

	static public void menu() {
		// creamos un objeto tipo graficas
		Graficas grafica = new Graficas();
		grafica.titulo1();
		System.out.println("\r\n\tDonde ser Vi'o es la forma de SALIR");


		boolean game_on = true;
        boolean valid = true;
		System.out.println("\r\n\t\t¡Hola! ¿Cómo te llamas?");
		String nombreJugador = scanner.nextLine();
		System.out.println("\r\n\t\tBienvenid@ " + nombreJugador);
		Tablero tablero = new Tablero();

		tablero.crearTablero();
		tablero.crearCarro();
		tablero.tableroFalso();

		System.out.println("\r\n" + nombreJugador + ", ingresa tu opción:");
		System.out.println("\t 1- Iniciar Juego\r\n\t 2- Salir");
		System.out.print("Opcion (Sólo Número):  ");
		String opcion = scanner.nextLine();
        while(valid){
    		if (opcion.equals("1")) {
    			System.out.println("\r\n\t\t   ¡A Jugar!");
    			System.out.println("\r\n\t\tPuntaje Inicial: 0");
    			tablero.mostrarMatriz();
                valid = false;

    			while (game_on) {
    				game_on = tablero.lanzarHuevo(scanner);	
    			}
    
    		} else if (opcion.equals("2")) {
                valid = false;
    			grafica.gameOver();
    			System.out.println("\r\n\t\tPuntaje Final: " + tablero.puntajeTotal);
                
    		} else {
    			System.out.println("Opción inválida");
    		}
        }
	}

	public static void main(String[] args) {

		menu();

	}
}
