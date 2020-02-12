package com.servex;

import java.util.Collections;
import java.util.Scanner;

public class Justifak {
	public static void main (String [] arguments) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int largo = 0;
		int numSpa = 0;
		int residual;
		int h = 0;
		String spaAdic;
		
		System.out.println("Ingrese el texto a justificar: ");
		
		try {
			String texto = scanner.nextLine();
			System.out.println("");
			String [] palabras = texto.split(" +");
					
			while (i < palabras.length) {
				largo += palabras[i].length();
				
				if (largo >= 80 || i == (palabras.length - 1)  ) {				
					if ( largo >= 80 ) {
						largo -= palabras[i].length();
						i--;					
						numSpa = (80 - largo) / (j - 1);					 
						spaAdic = String.join("", Collections.nCopies(numSpa, " "));
						residual = (80 - largo) % (j - 1);					
					} else {					
						spaAdic = "";
						residual = 0;
					}				
					
					while (h <= i) {
						System.out.print(palabras[h]);
						if (h < i) {
							System.out.print(" " + spaAdic);						
							if (residual > 0) {
								System.out.print(" ");
								residual--;
							}						
						}
						h++;
					}
					largo = 0;
					j = 0;
					System.out.println("");
				} else {
					j++;
					largo++;	
				}
				i++;				
			}		
			scanner.close();	
		} catch (Exception e) {
			System.out.println(e + e.getMessage());
		}		
	}
}
