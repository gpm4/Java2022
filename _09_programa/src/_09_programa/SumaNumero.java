package _09_programa;

public class SumaNumero {

	public static void main(String[] args) {
		// Tenemos dos numeros en dos variables cualquiera
		// Hacer un programa que muestre la suma de todos los numeros naturales comprendidos entre ellos
		
		
		int a=25, b=30;
		int suma=0;
		
		
		if(a>b) {
		for (int i=b;i<=a;i++) {
		
		
			
			
			
			suma=suma+i;}}
		
		else { 
			
			for (int i=b;i<=a;i++) {suma=suma+i;
		}
		
				System.out.println(suma);
		
				
			//Solucion 2
				
				int menor, mayor;
				
				if (a<b) {menor=a;
						  mayor=b;}
				
				else {menor=b; mayor=a;}
				
				for (int i=menor;i<=mayor;i++) {suma=suma+i;}
				
				
				
				
				
		
		
		}	
	}
}
