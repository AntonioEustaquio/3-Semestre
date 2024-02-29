package pratica1;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = (Celsius * 1.8) + 32;
		System.out.println("Fahrenheit = " + Fahrenheit);
		input.close();
	}

}
