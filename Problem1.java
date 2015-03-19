import java.util.Scanner;
public class Problem1 {
	
	public static void main(String args[]){
		Scanner key=  new Scanner(System.in);
		
		int numberOne = key.nextInt();
		int numberTwo = key.nextInt();
		
		key.close(); // close Scanner
		
		int sum =  numberOne + numberTwo;
		
		System.out.println(sum);
	}

}
