import java.util.Scanner;

public class Calc {
	
	public static void main (String [] args) {
		Scanner tec = new Scanner(System.in);
		int op;
		float n1,n2;
		
		do{
			System.out.println("Digite o primeiro numero");
			n1=tec.nextFloat();
			System.out.println("Digite o segundo numero");
			n2=tec.nextFloat();
	
			
			System.out.println("Digite a operação desejada");
			System.out.println("[1] Soma");
			System.out.println("[2] Subtração");
			System.out.println("[3] Multiplicação");
			System.out.println("[4] Divisão");
			System.out.println("[0] Sair");
			op=tec.nextInt();
			
			switch (op) {
				
			case 1: 
				float soma = n1+n2;
				System.out.println("Soma: "+soma);
				break;
				
			case 2: 
				float subtracao = n1-n2;
				System.out.println("Subtração: "+subtracao);
				break;
				
			case 3: 
				float multi = n1*n2;
				System.out.println("Multiplicação: "+multi);
				break;
				
			case 4: 
				float div = n1/n2;
				System.out.println("Divisão: "+div);
				break;
				
			default:
				System.out.println("Opção Inválida");
			}
		}while(op!=0);
	tec.close();
	}

}

