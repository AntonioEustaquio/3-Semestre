package pratica1;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Valor do salário mínimo: ");
		double salarioMinimo = input.nextDouble();
		System.out.print("Informe o salário do funcionário: ");
		double salarioFuncionario = input.nextDouble();
		double quantSalarios = salarioFuncionario / salarioMinimo;
		System.out.println(" Quantidade de salários mínimos: " + quantSalarios);
		input.close();
	}

}
