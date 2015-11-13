import java.io.*;


public class processo 
{
	public static void main(String[] args) throws IOException 
	{
		Arquivos entrada = null;
		Arquivos saida = null;
		File arq = new File("arquivos.txt");
		Arquivos arquivos = new Arquivos(arq);

		File directory = new File(".");

		Calculadora calculadora = new Calculadora();
		String[] chars;

		int v1;
		int v2;
		float resultado =0;
		char operador;

		while (true) 
		{
			String[] filesNames = directory.list();

			for (String fileName : filesNames) 
			{
				if (fileName.contains("Process")) 
				{
					entrada = new Arquivos(new File(fileName + "/input.txt"));

					if (!entrada.isEmpty()) 
					{
						saida = new Arquivos(new File(fileName+ "/output.txt"));

						String[] value = entrada.readContent().split(" ");

						v1 = Integer.parseInt(value[0]);
						operador = value[1].charAt(0);
						v2 = Integer.parseInt(value[1]);

						switch (operador) 
						{
							case '+':
							{
								resultado = calculadora.adicao(v1, v2);
							}	
								break;
							case '-':
							{
								resultado = calculadora.subtracao(v1, v2);
							}	
								break;
							case '*':
							{
								resultado = calculadora.multiplica(v1, v2);
							}
								break;
							case '/':
							{
								resultado = calculadora.dividir(v1, v2);
							}
								break;
						}


						arquivos.addContent(+ v1+ " " + operador + " " + v2 + "\n" +  "\n\n", true);
						saida.addContent(String.format("%f", resultado), false);
						entrada.clear();
					}
				}
			}
		}
	}
}
