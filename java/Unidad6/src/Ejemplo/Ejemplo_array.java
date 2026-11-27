package Ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo_array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("¿Cuántos espacios quieres guardar?");
		int n= Integer.parseInt(entrada.readLine());
		
		int num[]= new int [n];
		
		for (int i=0; i<num.length; i++ ) {
			System.out.println("Dime un número a guardar ");
			num[i]=Integer.parseInt(entrada.readLine());
		}
		
		System.out.println("Los números guardados son: ");
		System.out.println(" ");
		
		for (int i=0; i<num.length; i++ ) {
			System.out.println("Número "+(i+1)+":");
			System.out.println(num[i]);
			System.out.println(" ");
		}
		
		int mayor = num[0];   
		int menor = num[0];

		for (int i = 1; i < num.length; i++) {
		    if (num[i] > mayor) {
		        mayor = num[i];   
		    }
		}
		
		for (int i = 1; i < num.length; i++) {
		    if (num[i] < menor) {
		        menor = num[i];   
		    }
		}
		
		

		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: "+menor);
	}//fin main

}//fin class
