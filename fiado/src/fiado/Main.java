package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();
		consumidor.nome = "Paula";
		consumidor.fiados = new int[10];
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		System.out.print("Informe o valor da compra R$ ");
		consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());
		
		
		while (consumidor.fiados[0] <= 0) {
			System.out.println("Favor informar um valor positivo");
			System.out.print("Informe o valor da compra R$ ");
			consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());
		}

		int total = somaWhile(consumidor.fiados);
		
		if (total >= 100) {
						
		System.out.println("Cliente "+ consumidor.nome +" deve um total de R$ " + total);
		
		}
	}
	
	public static int somaWhile(int[] fiados) {		
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;		
	}
	
}
