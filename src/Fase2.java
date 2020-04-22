import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		
		String num1="";
		String num2="";
		String num3="";
		String num4="";
		String num5="";
		String num6="";

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la primera ciudad:");
		num1= entrada.nextLine();
		
		System.out.print("Introduce la segunda ciudad:");
		num2=entrada.nextLine();
		
		System.out.print("Introduce la tercera ciudad:");
		num3=entrada.nextLine();
		
		System.out.print("Introduce la cuarta ciudad:");
		num4=entrada.nextLine();
		
		System.out.print("Introduce la quinta ciudad:");
		num5=entrada.nextLine();
		
		System.out.print("Introduce la sexta ciudad:");
		num6=entrada.nextLine();
		
		String[] arrayCiutats= {num1, num2, num3, num4, num5, num6};
		
		Arrays.sort(arrayCiutats);
	    for (int i = 0; i < arrayCiutats.length; i++) {
	        System.out.println(arrayCiutats[i]);
	    }
	}

}
