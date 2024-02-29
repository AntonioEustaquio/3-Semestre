package pratica1;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Informe a diagonal maior do losângo: ");
		double dMaior = input.nextDouble();
		System.out.print("Informe a diagonal menor do losângo: ");
		double dMenor = input.nextDouble();
		double area = (dMaior * dMenor) / 2;
		System.out.println("A area do losângo é : " + area);
	}

}
