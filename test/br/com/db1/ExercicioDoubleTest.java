package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1.ExercicioDouble;

public class ExercicioDoubleTest {	

	
	@Test
	public void ehMenorTest(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();
		assertTrue(exercicioDouble.ehMenor(5.0, 5.7));
		assertFalse(exercicioDouble.ehMenor(10.5, 5.3));
	}
	
	@Test
	public void ehMenor3Test(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();		
		exercicioDouble.ehMenor3(5.0, 5.7, 6.0);
				
	   

	}

}
