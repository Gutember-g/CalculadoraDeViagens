package CalculadoraViagens;

import java.util.Scanner;

public class calculadoraViagens {
	/*Area onde declaramos as variaveis e as listas usadas no
	* programa*/
	static String destinos[] = {"Fortaleza", "Machu-Pichu", "Roma"};
	static double precos[]= {2500.0, 4500.0, 8000.0};
	static Scanner s = new Scanner(System.in);
	static double destino = 0;

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	listarDestinos(destinos);
	mostrarMenu();
	
	}

	private static void mostrarMenu() {
	// TODO Auto-generated method stub
	/*Método onde mostramos o menu inicial do prorama, usando o switch e um looping do while*/
	int opcao;
	do {
		Scanner s = new Scanner(System.in);
		System.out.println("==== Calculadora de Viagens ====");
		System.out.println("Opcao 1- Calcular Viagem");
		System.out.println("Opcao 2- Comparar Viagem ");
		System.out.println("Opcao 3- Sair");
		opcao = s.nextInt();
		switch(opcao){
	case 1:
		opcao = 1;
		calcularPacote();
		break;
	case 2:
		opcao = 2;
		compararPacote();
		break;
	case 3:
		opcao = 3;
		System.out.println("===========================");
		
		System.out.println("Ate a proxima");
		break;
		default:
		System.out.println("===========================");
		
		System.out.println("Opcao invalida!!");
		}
		} while (opcao != 3);
		
	
	}
	
	private static void compararPacote() {
		// TODO Auto-generated method stub
		/*Metodos de comparação de viagens usando o for para mostrar os destinos em uma tabela
		* e já chama o metodo calcularPacote()*/
		for(int i = 0; i< destinos.length; i++) {
			System.out.println(i + "- "+ destinos[i] + ": " + precos[i]);
			}
			System.out.println("===========================");
			System.out.println("Qual o numero do destino escolhido? ");
			int nDestino = lerInteiro("");
			System.out.println("===========================");
			destino = precos[nDestino];
			calcularPacote();
		}
	
	private static void calcularPacote() {
		// TODO Auto-generated method stub
		/*Método de calculo do pacote de viagem, usamos qui metodo if else, entrada de dados e variaveis*/
		double pacoteBase= 0;
		System.out.println("===========================");
		
		System.out.println("Quantidade de dias?");
		int dias= lerInteiro("");
		System.out.println("===========================");
		
		System.out.println("Quantidade de pessoas?");
		int pessoas= lerInteiro("");
		System.out.println("===========================");
		
	
	if(destino == 0) {
		System.out.println("Qual valor do pacote ?");
		pacoteBase = lerDouble("");
		}else {
		pacoteBase = destino;
		}
		double total = pacoteBase + (dias * 150 * pessoas);
		double porPessoa = total/pessoas;
		double porDia = total / dias;
		System.out.println("===========================");
		System.out.printf("Custo total da viagem: R$ %.2f%n", total);
		System.out.printf("Custo por pessoa: R$ %.2f%n", porPessoa);
		System.out.printf("Custo por dia: R$ %.2f%n", porDia);
		System.out.println("===========================");
		System.out.println("");
		System.out.println("Dias de antecedencia: ");
		int diasAntecedencia = lerInteiro("");
		double desconto;
		if(diasAntecedencia > 30) {
		desconto = (total * 0.1);
		}else {
		desconto = 0;
		}
		System.out.println("===========================");
		System.out.printf("Desconto total: R$ %.2f%n", desconto);
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");
	
	}
	
	
	public static void listarDestinos(String[] destinos) {
		/* Método que lista os destinos da lista usando for*/
		System.out.println("==== Nossos Destinos: ====");
		for(int i = 0; i< destinos.length; i++) {
		System.out.println(destinos[i] + ": " + precos[i]);
		}
		System.out.println("");
		}
	
	public static int lerInteiro(String mensagem) {
		/* metodo para ler entrada de numeros inteiros*/
		System.out.print(mensagem);
		int valor = 0;
		try {
		valor = s.nextInt();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return valor;
	}
	
	public static double lerDouble(String mensagem) {
		/* metodo para ler entrada de numeros reais*/
		System.out.println(mensagem);
		double valor = 0;
		try {
		valor = s.nextDouble();
		}catch (Exception e) {
		e.printStackTrace();
		}
		return valor;
		}

}