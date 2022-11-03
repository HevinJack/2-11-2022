package assignment2;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=10,c=13;
		
		if (a>b) {
			if(a>c) {
				System.out.println("a is greater than all");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("b is greater than all");
			}
		}
		else {
			System.out.println("c is greater than all");
		}
	
	}

}
