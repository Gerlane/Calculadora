public class Operacao 
{
	private int v1, v2;
	private char operador;	
	private boolean check = false;
	
	
	public Operacao() 
	{
		check = true;
	}

	public int getV1() 
	{
		return v1;
	}

	public void setV1(int va) 
	{
		this.v1 = va;
	}

	public int getV2() 
	{
		return v2;
	}

	public void setV2(int vb) 
	{
		this.v2 = vb;
	}

	public char getOperador() 
	{
		return operador;
	}

	public void setOperador(char operador) 
	{
		this.operador = operador;
	}
	
	public boolean isDisponivel() 
	{
		return check;
	}

	public int somar()
	{
		return this.v1 + this.v2;
	}
	
	public int subtrair()
	{
		return this.v1 - this.v2;
	}
	
	public int multiplicar()
	{
		return this.v1* this.v2;
	}
	
	public int dividir()
	{
		return this.v1 / this.v2;
	}
	
	public int calculo()
	{
		int resultado; 
		
		if(this.operador == '+')
		{
			resultado = somar();
		} else 
			if (this.operador == '-')
			{
				resultado = subtrair();			
			} else 
				if(this.operador == '*') 
				{
					resultado = multiplicar();			
				} else 
				{
					resultado = dividir();
				}
		
		return resultado;
	}	
	
	public synchronized void setOk(int v1, int v2, char operador) 
	{

	    while (check == false) 
	    {

	        try 
	        {
	            wait();
	        } 
	        catch (InterruptedException e) 
	        { 
	        	System.out.println(e.getMessage());
	        }
	    }
	    
	    setV1(v1);
	    setV2(v2);
	    setOperador(operador);
	    check = false;
	    notifyAll();
	}
	
	public synchronized Operacao getOk() {
	    
		while (this.check == true) {
	        try {
	            wait();
	        } catch (InterruptedException e) {
	        	System.out.println(e.getMessage());
	        }
	    }

	    check = true;
	    notifyAll();
	    
	    return this;
	}
}