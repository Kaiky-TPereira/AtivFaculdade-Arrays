package Exemplos;

import java.util.Scanner;

public class vet1 {
	
	public static int soma(int[] lista) {
		//2. Essa linha de c�digo soma os valores do vetor
				int soma = 0;
				for(int i = 0; i < lista.length; i++){ 
					soma += lista[i];
				}
					return soma;
				
	}
	
	public static int media(int[] lista) {
		//2. Essa linha de c�digo soma os valores do vetor
				int soma = 0;
				for(int i = 0; i < lista.length; i++){ 
					soma += lista[i];
				}
					return soma/lista.length;
				
	}
	
	public static int contaAbaixa(int[] lista, int media) {
		int cont = 0;
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] < media) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int maior(int[] lista, int media) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] > media) {
				media = lista[i];
			}
		}
		
		return media;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] lista = new int [10];
		
		System.out.println("Informe 10 valores que vamos somar eles no final");
		
		//1. Essa fun��o pede para voc� informar os valores no vetor
		for(int i = 0; i < lista.length; i++){ 
			System.out.println("Informe o valor da posi��o "+ i +" : "); 
			lista [i] = s.nextInt();	
		}
		
		//2. Essa linha de c�digo soma os valores do vetor
		int soma = 0;
		for(int i = 0; i < lista.length; i++){ 
			soma += lista[i];
		}
		
		//3. Escrever o valor da soma
		System.out.println("A soma dos 10 n�meros deu: "+ soma(lista));
	
		//4. Escrever a m�dia dos valores	
		System.out.println("A m�dia �: "+ media(lista));
			
		//5. Escrever quantidade de n�meros abaixo da m�dia
		System.out.println("A quantidade de n�meros abaixo da m�dia �: "+ contaAbaixa(lista, media(lista)));
		
		//6. Retornar o maior n�mero dentre todos eles
		System.out.println("O maior valor �: "+ maior(lista,media(lista)));

	}
	 
}
