package bhaskara;

import br.com.softblue.commons.io.Console;

public class BhaskaraResolution {

	public static void main(String[] args) {
		
		System.out.println("Digite o A: ");
	    int a = Console.readInt();
	    
	    System.out.println("Digite o B: ");
	    int b = Console.readInt();
	    
	    System.out.println("Digite o C: ");
	    int c = Console.readInt();
	    
	    double delta = Math.pow(b, 2) - 4*a*c;
	    
	    double x1 = (-b + Math.sqrt(delta)) /(2*a);
	    double x2 = (-b - Math.sqrt(delta)) /(2*a);
	    
	    System.out.println("O valor de x1 é = " + x1);
	    System.out.println("O valor de x2 é = " + x2);
	    
	}

}
