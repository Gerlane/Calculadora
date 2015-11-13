
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculadora 
	{
			int op1, op2;
			char operador;
			float resultado;
		
			public double calcula(int op1, int op2, char operador) 
			{
				double result = 0;
				this.op1 = op1;
				this.op2 = op2;
				this.operador = operador;
				
				switch (operador) 
				{
					case '+':
						{
							result = op1 + op2;
							break;
						}
					case '-':
						{
							result = op1 - op2;
							break;
						}
					case '/':
						{
							result = op1 / op2;
							break;
						}
					case '*':
						{
							result = op1* op2;
							break;
						}
				}
				
				try 
				{
					PrintWriter log = new PrintWriter(new FileWriter("log.txt",true), true);
					log.write(this.dados());
					log.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
					
				}
				return result;
			}
		
			public String dados() 
			{
		
		
				return (String.valueOf(op1) + operador + String.valueOf(op2));
			}
		}
