import java.util.Scanner;

public class Fase4 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		//PRIMERA CIUDAD
		
			String num1="";
			System.out.print("Introduce la primera ciudad:");
			num1= entrada.nextLine();
			
			String[] ciutat1 = {num1};
			String primeraCiudad = num1;
			String inversaCiudad1 = "";
			
			for(int i=num1.length()-1; i>=0; i--) {
	
				inversaCiudad1 +=  primeraCiudad.charAt(i);
				
			}
			System.out.println(ciutat1[0]+", "+inversaCiudad1);
		
		//SEGONA CIUTAT
			String num2="";
			System.out.print("Introduce la segunda ciudad:");
			num2=entrada.nextLine();
			
			String[] ciutat2 = {num2};			
			String segundaCiudad = num2;
			String inversaCiudad2 = "";
			
			for(int i=num2.length()-1; i>=0; i--) {
	
				inversaCiudad2 +=  segundaCiudad.charAt(i);
				
			}
			System.out.println(ciutat2[0]+", "+inversaCiudad2);
			
		//TERCERA CIUTAT
			String num3="";
			System.out.print("Introduce la tercera ciudad:");
			num3=entrada.nextLine();
			
			String[] ciutat3 = {num3};
			String terceraCiudad = num3;
			String inversaCiudad3 = "";
			
			for(int i=num3.length()-1; i>=0; i--) {
	
				inversaCiudad3 +=  terceraCiudad.charAt(i);
				
			}
			System.out.println(ciutat3[0]+", "+inversaCiudad3);
		
		//CUARTA CIUTAT
			String num4="";
			System.out.print("Introduce la cuarta ciudad:");
			num4=entrada.nextLine();
			
			String[] ciutat4 = {num4};
			String cuartaCiudad = num4;
			String inversaCiudad4 = "";
			
			for(int i=num4.length()-1; i>=0; i--) {
	
				inversaCiudad4 +=  cuartaCiudad.charAt(i);
				
			}
			System.out.println(ciutat4[0]+", "+inversaCiudad4);
		
		
		//CINQUENA CIUTAT
			String num5="";
			System.out.print("Introduce la quinta ciudad:");
			num5=entrada.nextLine();
			
			String[] ciutat5 = {num5};
			String cinquenaCiudad = num5;
			String inversaCiudad5 = "";
			
			for(int i=num5.length()-1; i>=0; i--) {
	
				inversaCiudad5 +=  cinquenaCiudad.charAt(i);
				
			}
			System.out.println(ciutat5[0]+", "+inversaCiudad5);
		
		//SISENA CIUTAT
			String num6="";
			System.out.print("Introduce la sexta ciudad:");
			num6=entrada.nextLine();
			
			String[] ciutat6 = {num6};
			String sisenaCiudad = num6;
			String inversaCiudad6 = "";
			
			for(int i=num6.length()-1; i>=0; i--) {
	
				inversaCiudad6 +=  sisenaCiudad.charAt(i);
				
			}
			System.out.println(ciutat6[0]+", "+inversaCiudad6);

		


	}

}
