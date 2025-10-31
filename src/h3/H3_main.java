package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int i = 77;
		int j = 780;
		int k = 7900;
		
		boolean a, b, c;
		
		a = i > j; //Ausdruck 1: i > j? true
		b = i > 200; //Ausdruck 2 i > 200? false
		c = j > 100; //Ausdruck 3 j > 100? false
	
		k -= 10;

		if (a) {
	if (!b) {
		if (!c) {k = 1; } {
			System.out.println ("i hat den Wert " + i );}
			{System.out.println ("j hat den Wert " + j );}
			{System.out.println ("k hat den Wert " + k );}
		
		}
	}
		if (a) {
			if (b) {
				if (!c) {k = 2; System.out.println ("k hat den Wert " + k );}
				{System.out.println ("j hat den Wert " + j );}
				{System.out.println ("k hat den Wert " + k );}
				
				}
			if (a) {
				if (b) {
					if (c) {k = 3; System.out.println ("k hat den Wert " + k );}
					{System.out.println ("j hat den Wert " + j );}
					{System.out.println ("k hat den Wert " + k );}
					
					}
				if (!a) {
					if (!b) {
						if (!c) {k = 4; System.out.println ("k hat den Wert " + k );}
						{System.out.println ("j hat den Wert " + j );}
						{System.out.println ("k hat den Wert " + k );}
						
		
									
						}
}
			}
		}
	}
}

