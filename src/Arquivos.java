import java.io.*;


public class Arquivos 
{
	private File arq;
		
	public Arquivos(File arq) 
	{
		this.arq = arq;
		
		if(!this.arq.exists())
		{
			try 
			{
				this.arq.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public File getArq() 
	{
		return arq;
	}

	public void setArq(File arq) 
	{
		this.arq = arq;
	}
	
	public void ifArq(File arq)
	{
		
	}
	
	public void addContent(String content, boolean append) throws IOException 
	{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.getArq(), append)));
		
		writer.write(content);
		
		writer.close();
	}
	
	public String readContent() throws IOException
	{
		String qwerty = "";
		BufferedReader leitor = new BufferedReader(new InputStreamReader(new FileInputStream(this.getArq())));
		
		while(leitor.ready())
		{
			qwerty += leitor.readLine();
		}
		
		leitor.close();
		
		return qwerty;
	}
	
	public boolean isEmpty()
	{
		if(this.getArq().exists())
		{
			return this.getArq().length() == 0;
		}
		return false;
	}
	
	public void clear() throws IOException
	{
		this.addContent("", false);
	}
}