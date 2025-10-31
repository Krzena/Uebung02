package h2;

public class H2_main {

	public static void main(String[] args) {
		
		int i = 100;
		int j = 26;
		int k = 44;
		int min = i;
		int max = i;
		
		if (j < min) {min = j;}
		if (k < min) {min = k;}
		
		if (j > max) {max = j;}
		if (k > max) {max = k;}
		
 
 System.out.println ("Minimum hat den Wert " + min);
 System.out.println ("Maximum hat den Wert " + max);
	}

}
