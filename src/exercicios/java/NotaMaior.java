package exercicios.java;

import java.util.Scanner;
public class NotaMaior {
	public static void main(String[] args) {
			double nota1 = 0, nota2 = 0, nota3 =0;
			String nome, p, s, t;
			p= "PRIMEIRA";
			s= "SEGUNDA";
			t= "TERCEIRA";

			Scanner aluno = new Scanner(System.in);
			System.out.println("Programa Retorna a maior nota e diz qual a posicao da nota: ");
			System.out.println(" Digite o Nome do Aluno: ");
			nome = aluno.nextLine();
			System.out.println("Digite a "+p+ "nota");
			Scanner p1 = new Scanner(System.in);
			
			nota1 = p1.nextDouble();
			System.out.println("Digite a "+s+ "nota");
			Scanner p2 = new Scanner(System.in);
			nota2 = p2.nextDouble();
			System.out.println("Digite a "+t+ "nota");
			Scanner pf = new Scanner(System.in);
			nota3 = pf.nextDouble();
			if(nota1 > nota2 && nota1 > nota3){
				System.out.println("A MAIOR NOTA DO ALUNO ");
			}
			else if( nota2 > nota1 && nota2 > nota3){
				System.out.println("A MAIOR NOTA DO ALUNO ");
			}
			else if( nota3 > nota2 && nota3 > nota1){
				System.out.println("A MAIOR NOTA DO ALUNO ");
			}
			else
				System.out.println("NÃO HÁ MAIOR NOTA!! AS NOTAS DO ALUNO ");
			System.exit(0); //finalizando o programa
}
}