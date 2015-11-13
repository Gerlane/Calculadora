
public class Principal 
{
	public static void main(String[] args) 
	{
		Operacao operacao = new Operacao();
		
		Entrada enter = new Entrada(operacao);
		Calculadora caleSa = new Calculadora(operacao);
		
		Thread t1 = new Thread(enter);
	    Thread t2 = new Thread(caleSa);
	
		t1.start();
		t2.start();
	}
}