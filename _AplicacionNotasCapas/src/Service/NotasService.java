package Service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas=new ArrayList <>();
	
	public void guardarNota(double nota) {
		notas.add(nota);
		}
	
	public double media(){
		
		double media=0;
		for(int i=0;i<notas.size();i++) {
			media=media+notas.get(i);
		}
		media=media/notas.size();
		return media;
	}	
	
	public int aprobados() {
		int aprobados=0;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)>=5) {aprobados++;
			
			}
		}
		return aprobados;
	}
	
	public double notaMax() {
		double notaMax=notas.get(0);
		for(int i=0;i<notas.size();i++) {
			notaMax=Math.max(notaMax, notas.get(i));
		}
		return notaMax;
				
	}
	
	public double notaMin() {
		double notaMin=notas.get(0);
		for (int i=0;i<notas.size();i++) {
			notaMin=Math.min(notaMin, notas.get(i));
		}
		
		return notaMin;
			
	}
	
	public double[] notas() {
		double[] res=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			res[i]=notas.get(i);
		
		}
			
		return res;
	}
	
	public void eliminarSuspensos() {
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)<5) {notas.remove(i);}
		}
	}
	
}
