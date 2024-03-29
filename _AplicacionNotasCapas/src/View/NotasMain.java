package View;

import java.util.Scanner;

import Service.NotasService;

public class NotasMain {
	static NotasService notasService=new NotasService();//declaracion de variable. importar la clase Service.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt(); //lee la opción elegida.
			switch(opcion) { //evaluamos
			case 1:
				pedirNota();
				break;
			case 2:
				mostrarMedia();
				break;
			case 3:
				mostrarAprobados();
				break;
			case 4:
				mostrarExtremas();
				break;
			case 5:
				mostrarTodas();
				break;
			case 6:
				eliminarSuspensos();
			}
			
				
		}while(opcion!=7);
	
	}
	static void mostrarMenu() {
		System.out.println("1.-  Grabar nota");
		System.out.println("2.- Calcular media");
		System.out.println("3.- Aprobados");
		System.out.println("4.- Notas extremas");
		System.out.println("5.- Mostrar todas");
		System.out.println("6.- EliminarSuspensos");
		System.out.println("7.- Salir");
		
	}
	static void pedirNota() {
		Scanner sc=new Scanner(System.in);
		double nota;
		System.out.println("Introduce nota");
		nota=sc.nextDouble();
		notasService.guardarNota(nota); 
		
	}
	static void mostrarMedia() {
		System.out.println("La media es: "+notasService.media());
	}
	static void mostrarAprobados() {
		System.out.println("Aprobados: "+notasService.aprobados());
	}
	static void mostrarExtremas() {
		System.out.println("Nota máxima: "+notasService.notaMax());
		System.out.println("Nota mínima: "+notasService.notaMin());
	}
	static void mostrarTodas() {
		double[] notas=notasService.notas();
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
	}
		
	}
	static void eliminarSuspensos() {
		notasService.eliminarSuspensos();
	}
}
