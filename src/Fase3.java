import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fase3 {
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

	    char lletra='a';
	    String paraula= " ";
	    
	    for (int j = 0; j < arrayCiutats.length; j++) {
	    	paraula = arrayCiutats[j];

	    	int longitudParaula = arrayCiutats[j].length();

	    	for(int z = 0; z<longitudParaula; z++) {
		    	lletra = paraula.charAt(z);

			    	if(lletra == 'a'||lletra=='e'||lletra=='i'|| lletra=='o'|| lletra == 'u'){
			    		
			    		paraula += '4';
			    		
			    	}else {
			    		paraula += paraula.charAt(z);
			    	}
			    	

	    	}
	    	int finalParaula = longitudParaula * 2;
	    	String subParaula = paraula.substring(longitudParaula, finalParaula);
	    	System.out.println("Estas son las ciudades con los cuatros: " + subParaula);	
	    }
	    
	}
}
