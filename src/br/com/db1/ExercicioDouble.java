package br.com.db1;

public class ExercicioDouble {
	
	
	public Boolean ehMenor(Double valor1, Double valor2){
		return valor1 < valor2;
	}
	
	public Double ehMenor3(Double valor1, Double valor2 , Double valor3){	
	
		if ((valor1 > valor2)&&(valor2 > valor3))
			return valor1;	
		if ((valor2 > valor1)&&(valor1 > valor3))
			return valor2;
	        else
	    	return valor3;
	}
}
