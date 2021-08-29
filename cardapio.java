package teste3;

import java.util.Scanner;

public class cardapio {

	public static void main(String[] args) {
		
		int opcao = 0;
		float valorPedido = 0;
		do {
		
		System.out.println("=========");
		System.out.println("CARDÁPIO");
		System.out.println("=========");
		System.out.println("1-Porção de batata G:R$15,00");
		System.out.println("2-Porção de batata com cheddar G:R$18,00");
		System.out.println("3-Porção de batata com cheddar e bacon G:R$20,00");
		System.out.println("4-cola cola 2l:R$12,00");
		System.out.println("5-sprite 2l:R$7,00");
		System.out.println("6-fanta 2l:R$6,50");
		System.out.println("7-Fechar Pedido");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Por favor Digite seu pedido: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			valorPedido = valorPedido +15;
			break;
		case 2:
			valorPedido = valorPedido +18;
			break;
		case 3:
			valorPedido = valorPedido +20;
			break;
		case 4:
			valorPedido = valorPedido +12;
			break;
		case 5:
			valorPedido = valorPedido +7;
			break;
		case 6:
			valorPedido = (float) (valorPedido +6.50);
			break;
		case 7:
			System.out.println("Pedido Fechado");
			break;
		}
		System.out.println("O total do pedido foi: "+valorPedido);
		
		}while(opcao != 7);
		
		
		
		
		
		
		
		
		

	}

}
