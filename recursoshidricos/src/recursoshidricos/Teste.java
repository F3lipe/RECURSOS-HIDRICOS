package recursoshidricos;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double comprimento_cisterna = sc.nextDouble();
		Double largura_cisterna = sc.nextDouble();
		Double profundidade_cisterna = sc.nextDouble();
		Double capacidade_cisterna = comprimento_cisterna * largura_cisterna * profundidade_cisterna;

		Double comprimento_agua = sc.nextDouble();
		Double largura_agua = sc.nextDouble();
		Double profundidade_agua = sc.nextDouble();
		Double capacidade_agua = comprimento_agua * largura_agua * profundidade_agua;

		Double agua_disponivel = capacidade_agua * 1000;

		System.out.println("A cisterna tem a capacidade de: " + capacidade_cisterna + " M³");
		System.out.println("A água disponível na cisterna é de: " + agua_disponivel + " L");

	}
}
