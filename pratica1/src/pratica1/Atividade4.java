package pratica1;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe b: ");
		int b = input.nextInt();
		System.out.print("Informe c: ");
		int c = input.nextInt();
		
		int a = b + c;
		System.out.print(" a = " + a);
		input.close();

	}

}
