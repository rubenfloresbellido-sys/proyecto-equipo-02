import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_ruben {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		CodigoLimpio_ruben comidas [] = new CodigoLimpio_ruben [5];
		CodigoLimpio_ruben pedido [] = new CodigoLimpio_ruben [20];
		int cantidadesPedido[]= new int[20];
		
		int contador=0;
		int opcion=0;
		
		comidas [0] = new CodigoLimpio_ruben (1,"Patatas bravas", 10, 6.5);
		comidas [1] = new CodigoLimpio_ruben (2,"Croquetas", 15, 8.5);
		comidas [2] = new CodigoLimpio_ruben (3,"Paella", 5, 14);
		comidas [3] = new CodigoLimpio_ruben (4,"Solomillo", 7, 18.5);
		comidas [4] = new CodigoLimpio_ruben (5,"Flamenquín", 14, 12);
		
		
		System.out.println(menu(comidas));
		System.out.println("0 Terminar pedido");
		System.out.println(" ");
		
		do {	
			System.out.println("Elija el plato que vas a pedir:");
			
			opcion=Integer.parseInt(entrada.readLine());
			
			switch (opcion) {
			case 1: 
				if (comidas[0].ProductoDisponible()) {
					cantidadesPedido [0]++;
					
					comidas[0].setCantidad(comidas[0].getCantidad()-1);
					
					System.out.println("Patatas bravas añadidas al pedido");
					
				}else {
					System.out.println("No quedan existencias");
				}break;
				
			case 2:
				if (comidas[1].ProductoDisponible()) {
					cantidadesPedido [1]++;
					
					comidas[1].setCantidad(comidas[1].getCantidad()-1);
					
					System.out.println("Croquetas añadidas al pedido");
					
				}else {
					System.out.println("No quedan existencias");
				}break;
				
			case 3:
				if (comidas[2].ProductoDisponible()) {
					cantidadesPedido [2]++;
					
					comidas[2].setCantidad(comidas[2].getCantidad()-1);
					
					System.out.println("Paella añadida al pedido");
					
				}else {
					System.out.println("No quedan existencias");
				}break;
				
			case 4:
				if (comidas[3].ProductoDisponible()) {
					cantidadesPedido [3]++;
					
					comidas[3].setCantidad(comidas[3].getCantidad()-1);
					
					System.out.println("Solomillo añadido al pedido");
					
				}else {
					System.out.println("No quedan existencias");
				}break;
				
			case 5:
				if (comidas[4].ProductoDisponible()) {
					cantidadesPedido [4]++;
					
					comidas[4].setCantidad(comidas[4].getCantidad()-1);
					
					System.out.println("Flamenquín añadido al pedido");
					
				}else {
					System.out.println("No quedan existencias");
				}break;
				
			case 0:
				System.out.println("Pedido finalizado");break;
				
				default:
					System.out.println("Opción incorrecta");
				}
			
			}while (opcion !=0);
		
		double total=0;
		
		System.out.println("==========CUENTA==========");
		
		for (int i = 0; i<comidas.length; i++) {
			if (cantidadesPedido[i]>0) {
				double precioTotal = comidas[i].getPrecioProducto()* cantidadesPedido[i];
			
			System.out.println(comidas[i].getNombre()+" -- "+ cantidadesPedido[i]+ " -- "+precioTotal + " €");
			total+= precioTotal;
			}
		}
		
		System.out.println("--------------------------");
		System.out.println("TOTAL: "+total+" €");
		
	}//fin main

	public static String menu (CodigoLimpio_ruben[] comidas) {
		String resultado = "==========MENÚ=========\n\n";
				
		for (int i = 0; i< comidas.length; i++) {
			resultado+= comidas[i].toString()+"\n";
		}
		
		return resultado;
	}//fin metodo
	
}//fin class
