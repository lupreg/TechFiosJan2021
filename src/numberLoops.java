import java.util.Scanner;

public class numberLoops {

	public static void main(String[] args) {
		for(int i = 0; i < 500; i++) {
			System.out.println(Math.random()*300);
			}
	
			Scanner scan = new Scanner(System.in);
			
			int smallest = 0;
			int number = 0;
				number = scan.nextInt();
				int i = 0;
				if (i == 1) {
					smallest = number;
				}
				if (number < smallest) {
					smallest = number;
					
				}
				{	System.out.println("the minimum number is" + smallest);
				}
			}
	}

			
	