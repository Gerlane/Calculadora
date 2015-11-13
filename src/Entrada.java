
import java.util.Scanner;

public class Entrada implements Runnable
{

	private Operacao operacao;
	
	
	public Entrada(Operacao opera2) {
		this.operacao = opera2;
	}

	@Override
	public void run()
	{
		Scanner leitor = new Scanner(System.in);
		int v1=0;
		int v2=0;
		char operador = ' ';
				
		while (true)
		{
			try
			{
				System.out.println("Digite o primeiro valor");
				v1 = (leitor.nextInt());
				System.out.println("Digite a operação +-*/");
				operador = (leitor.next().charAt(0));
				System.out.println("Digite o seungod valor");
				v2 = (leitor.nextInt());
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage());
			}

			operacao.setOk(v1, v2, operador);
		}
	}

}
