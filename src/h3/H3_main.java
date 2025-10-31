package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int i = 140;
		int j = 150;
		int k = -10;
		
		boolean a, b, c;
		
		a = i > j; //Ausdruck 1
		b = i > 200; //Ausdruck 2
		c = j > 100; //Ausdruck 3

		//Fall 1: Ausdruck 1 wahr, Ausdruck 2 falsch, Ausdruck 3 falsch -> k = 1
		if (a) {
		if (!b) {
		if (!c) { k=1; }
		}
		}
		
		//Fall 2: Ausdruck 1 wahr, Ausdruck 2 wahr, Ausdruck 3 falsch -> k = 2
		
		if (a) {
			if (b) {
			if (!c) { k=2; }
			}
			}
		
//Fall 3: Ausdruck 1 wahr, Ausdruck 2 wahr, Ausdruck 3 wahr -> k = 3
		
		if (a) {
			if (b) {
			if (c) { k=3; }
			}
			}
		
		//Fall 4: Ausdruck 1 falsch, Ausdruck 2 falsch, Ausdruck 3 falsch -> k = 4
		
				if (!a) {
					if (!b) {
					if (!c) { k=4; }
					}
					}
		//A5: Fall 5: In allen anderen Faellen -> k = -10
				
		System.out.println("j hat den Wert " + i);
		System.out.println("j hat den Wert " + j);
		System.out.println("k hat den Wert " + k); 
		
		


}
}
