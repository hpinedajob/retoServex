package com.servex;

public class Rectangler {
	
	public static void main (String[] args) throws Exception {		
		Utils utils = new Utils();		
		System.out.println("--- Inicio del programa ---");
		
		try {		
			Integer ancho = utils.getNumber("ancho (número entero entre 1 y 9)");
			Integer alto = utils.getNumber("alto (número entero entre 1 y 9)");		

			Float anchoMedio = (float) ancho/2;
			Float altoMedio = (float) alto/2;
			
			for (Integer y=1;y<=alto;y++) {		
				for (Integer x=1;x<=ancho;x++) {				
					System.out.print( (int) (ancho - Math.min(
								(x <= anchoMedio) ? (anchoMedio - Math.abs(x - anchoMedio) - 1) :
												    (anchoMedio - Math.abs(x - anchoMedio)) , 
								(y <= altoMedio) ? (altoMedio - Math.abs(y - altoMedio) - 1) :
												   (altoMedio - Math.abs(y - altoMedio)) 
									)) + " ");		
				}
				System.out.println("\n");
			}					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}
