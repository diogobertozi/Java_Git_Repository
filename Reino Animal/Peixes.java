
public class Peixes extends ReinoAnimal{
	
	double profundidade;
	
	public void setProfundidade(double pf)
	{
		profundidade = pf;
	}
	
	public double getProfundidade()
	{
		return profundidade;
	}
	
	public void print(Peixes v) 
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
		
		System.out.printf("\n\t Profundidade: %.2f m ",v.getProfundidade());

	}
	
}
