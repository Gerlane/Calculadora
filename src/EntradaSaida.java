import java.util.*;
import java.io.*;
import java.lang.management.ManagementFactory;


public class EntradaSaida 
{
	public static void main(String[] args) throws IOException 
	{
		final int pid = Integer.parseInt(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
	
		Scanner read = new Scanner(System.in);
	
		File dir = new File("Process" + String.format("%d", pid));
	
		dir.mkdir();
	
		Arquivos entrada = new Arquivos(new File(dir.getName() + "/input.txt"));
		Arquivos saida = new Arquivos(new File(dir.getName() + "/output.txt"));
	
		int v1;
		int v2;
		char operador;
	
		while (true) 
		{
			v1 = read.nextInt();
			operador = read.next().charAt(0);
			v2 = read.nextInt();
	
			entrada.addContent(String.format("%d %c %d\n", v1, operador, v2), false);

			while (saida.isEmpty());

			System.out.println(saida.readContent());

			saida.clear();
		}
	}
}