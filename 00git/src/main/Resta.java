package main;

public class Resta {

	public static int restaDosNumeros(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int restaAcumulada(int ... numeros) {
		 int acum = 0;
		for(int n:numeros) {
			
			acum -= n;
			
		}
		
		return acum;
		
	}
}
