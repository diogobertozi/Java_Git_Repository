
public class Mamiferos extends ReinoAnimal {
	
	boolean pelo;
	
	public void setPelo(boolean p)
	{
		pelo = p;
	}
	
	public boolean getPelo()
	{
		return pelo;
	}
	
	public void print(Mamiferos v) 
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
		
		if(v.getPelo()==true)
		{
			System.out.printf("\n\t Pelo: Sim ");
		}
		else
		{
			System.out.printf("\n\t Pelo: Nao ");
		}
		
	}
	
}	
