package exercicios.java;

import java.util.Scanner; //importa o pack scanner
public class EstadoCivil {
		public static void main(String[] args) {
		String nome;
		int estadoCivil;
		Scanner dados = new Scanner(System.in);
		System.out.println(" PROGRAMA PARA INDICAÇÃO DE ESTADO CIVIL: ");
		System.out.println("Digite Seu Nome: ");
		nome= dados.next(); //scanner do nome
		Scanner civil = new Scanner(System.in);
		System.out.println("Digite o número referente ao seu estado civil: ");
		System.out.println(" 1 - Solteiro(a) ");
		System.out.println(" 2 - Desquitado(a) ");
		System.out.println(" 3 - Casado(a) ");
		System.out.println(" 4 - Divorciado(a) ");
		System.out.println(" 5 - Viúvo(a) ");
		estadoCivil = civil.nextInt(); //scanner do numero referente às opcoes de estado civil
		if(estadoCivil > 5 || estadoCivil < 1) //consistencia: se o numero digitado for >5 ou <1 opcao 
			System.out.println(" Opção Invalida!! ");
		else
			switch (estadoCivil){ // switch case das opcoes de estado civil
				case 1:{
						System.out.println( nome);
						break;
				}
				case 2:{
						System.out.println( nome);
						break;
				}
				case 3:{
						System.out.println( nome);
						break;
				}
				case 4:{
						System.out.println( nome);
						break;
				}
				case 5:{
						System.out.println( nome);
						break;
				}
			}
			System.exit(0);
			}
}