/*
Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
*/
package ArrayVetorExercicios;

import java.util.Scanner;

public class ArrayVetor2 {

	public static void main(String[] args) {
		int vet[] = new int[10];
		int somaVetor=0,x;
		float mediaVet;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<10;x++){
			System.out.println("Entre com um numero: ");
			vet[x] = ler.nextInt();
			if(x% 2 == 1) {
				System.out.println("\nElemento de índice impar: "+vet[x]);
			}if(vet[x] %2 == 0) {
				System.out.println("\nO numero: "+vet[x] + " é um elmento par...");				
			}
			somaVetor += vet[x];
		}
		mediaVet = somaVetor / x;
		System.out.println("Soma dos elementos do vetor: " +somaVetor);
		System.out.println("A média dos elemtnos do vetor é: " + mediaVet);

	}

}
