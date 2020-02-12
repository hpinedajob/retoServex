package com.servex;

import java.util.Scanner;

public class Utils {

	private Scanner scanner = new Scanner(System.in);
	private String ingresado;
	private Integer response;
	
	public Integer getNumber(String txt) throws Exception {
		System.out.println("Ingrese " + txt + ": ");
		ingresado = scanner.nextLine();
		try {
			response = Integer.parseInt(ingresado);	
			if (response < 1 || response > 9) throw new Exception ("Valor ingresado fuera de rango.");
		}
			catch (NumberFormatException nfe){
				throw new Exception("Debe ingresar un valor numérico.");							
		}		
		return response;
	}	
}
