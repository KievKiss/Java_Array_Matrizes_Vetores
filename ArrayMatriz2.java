/*
Elabore um algoritmo que leia as notas de uma classe com
10 participantes durante 4 bimestres de um ano.
As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais,
logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais,
 armazene as médias de cada participante e exiba as médias de cada um na tela.
*/
package ArrayVetorExercicios;

import java.util.Scanner;

public class ArrayMatriz2 {

	public static void main(String[] args) {
		float part[][] = new float[10][4];
		float media[] = new float[10];
		int x,y;
		float somaNota = 0;
		
		Scanner ler = new Scanner(System.in);
		//x linha y coluna
		for(x=0;x<3;x++){
			for(y=0;y<10;y++) {
				System.out.println("\nEntre com "+(y+1)+"º. nota: ");
				part[x][y] = ler.nextFloat();
				somaNota += part[x][y];
			}
			media[x] = somaNota/4;
			somaNota = 0;
		}
		for(x=0;x<3;x++) {
			System.out.println("\nMédia do participante "+(x+1)+" foi de: " +media[x]);
		}
		
	

	}

}
