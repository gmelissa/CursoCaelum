package exercicios.java;

import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		String nomeFuncionario;
		double salBruto, salLiquido, horasTrab, valorHTrab;
		double inss = 1.10;

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Programa:::");
		System.out.println("Calcula Salário Bruto e Salário Líquido");
		System.out.print("\nEntre com o nome do Funcionário: ");

		nomeFuncionario = entradaDados.nextLine();

		System.out.print("Informe a Quantidade de horas Trabalhadas: ");
		
		horasTrab = entradaDados.nextDouble();

		System.out.print("Informe o valor das horas Trabalhadas: R$ ");

		valorHTrab = entradaDados.nextDouble();
		salBruto = (horasTrab * valorHTrab);
		salLiquido = (salBruto - inss);
		
		System.out.println("\n\n:::: Exibição dos dados informados ::::::::::");
		System.out.println("Nome: "+nomeFuncionario);
		System.out.printf("Salário Bruto: R$ %.2f", salBruto);
		System.out.printf("\nSalário Liquido: R$ %.2f", salLiquido);
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\nAutor: Moisés Tedeschi");
		System.out.println("Fim do Programa!!!");
		}
}