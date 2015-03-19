import java.util.Scanner;
public class problem2 {
	public static void main(String args[]){
		Scanner key =  new Scanner(System.in);
		
		int number =  key.nextInt();
		int add = 0;
		System.out.print("\n" + Sum(number, add, key));
		
	}
	
	static int Sum(int number, int add, Scanner key){
		if(number == 0)
			return add;
		else{
		   add += key.nextInt();
		   return Sum(number - 1, add, key);
		}

	}
}
