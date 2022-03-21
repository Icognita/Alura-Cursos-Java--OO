package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testandolistas {

	public static void main(String[] args) {
		
		String curso1= "c-heranca";
		String curso2="a-poliformismo"; 
		String curso3= "d-Java-io";
		

		
		ArrayList<String> cursos=new ArrayList<String>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
		cursos.remove(2);
		
		System.out.println(cursos);
		
		
		System.out.println("***********com forEach***********");
		
		for (String curso : cursos) {
			 
			System.out.println("Cursos: " + curso);
		}
		
		System.out.println("***********com for***********");
		
		for(int i=0; i < cursos.size();i++)
			System.out.println("Cursos  " + cursos.get(i));
		
		
			
			System.out.println("******* com get*************");
			
			String todosOsCursos = cursos.get(0);
			System.out.println("Curso da posição 0:  " + todosOsCursos); 
			
			
			
			
			System.out.println("******* com Metodo forEach*************");
			
			cursos.forEach(mycurso->{
				System.out.println("Percorrendo:");
				System.out.println("curso  " + mycurso);
			});
      
			
			System.out.println("**********Usando o metodo collections.sort***************");
		    Collections.sort(cursos);  
			System.out.println(cursos);
			
				
				
			
			
			
			
		
	}

}
