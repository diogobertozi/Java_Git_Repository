
public class Aves extends ReinoAnimal{
	
	boolean voa;
	
	public void setVoa(boolean v)
	{
		voa = v;
	}
	
	public boolean getVoa()
	{
		return voa;
	}
	
	double alturaVoo;
	
	public void setAlturaVoo(double hv)
	{
		alturaVoo = hv;
	}
	
	public double getAlturaVoo()
	{
		return alturaVoo;
	}
	
	public void print(Aves v) 
	{
		System.out.printf("\n\t--- Informacoes Gerais ---");
		System.out.printf("\n\t Altura: %.2f m ",v.getAltura());
		
		if(v.getChifre()==true)
		{
			System.out.printf("\n\t Chifres: Sim ");
		}
		else
		{
			System.out.printf("\n\t Chifres: Nao ");
		}
		
		System.out.printf("\n\t Peso: %d kg ",v.getPeso());
		System.out.printf("\n\t Cor: %s ",v.getCor());
		
		System.out.printf("\n\t--- Informacoes Específicas ---");
		
		if(v.getVoa()==true)
		{
			System.out.printf("\n\t Voa: Sim ");
		}
		else
		{
			System.out.printf("\n\t Voa: Nao ");
		}
		
		System.out.printf("\n\t Altura do Voo: %.2f m ",v.getAlturaVoo());
		
	}
	
}
