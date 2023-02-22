package exercícios_alura_java;

import java.util.Scanner;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario = s.nextDouble();

		if (salario >= 1900 && salario <=2800) {
			double imposto = salario * (7.5/100);
			System.out.println("Seu IR é de 7.5% e pode deduzir na declaração o valor de R$" + imposto);
		}
		else if (salario >= 2800.01 && salario <=3751.0) {
			double imposto = salario * (15.0/100);
			System.out.println("Seu IR é de 15% e pode na declaração deduzir R$" + imposto);
		}
		else if (salario >= 3751.01) {
			double imposto = salario * (22.5/100);
			System.out.println("Seu IR é de 22.5% e pode deduzir na declaração o valor de R$" + imposto);
		}
		else {
			System.out.println("Você é isento de IR");
		}
		s.close();
	}
}
