

public class Main {

	
	
	public static void main(String[] args) {
		
		Peixes peixe_boi = new Peixes ();   
		Peixes peixe_espada = new Peixes ();   
		Mamiferos macaco = new Mamiferos ();
		Mamiferos humano = new Mamiferos ();
		Aves penguin = new Aves ();
		Aves bem_te_vi = new Aves();
		
		peixe_boi.setAltura(0.45);
		peixe_boi.setChifre(false);
		peixe_boi.setCor("Verde");
		peixe_boi.setPeso(2);
		peixe_boi.setProfundidade(60);
		
		peixe_espada.setAltura(3.75);
		peixe_espada.setChifre(true);
		peixe_espada.setCor("Ciano");
		peixe_espada.setPeso(25);
		peixe_espada.setProfundidade(150);
		
		macaco.setAltura(1.20);
		macaco.setChifre(false);
		macaco.setCor("Marrom");
		macaco.setPeso(18);
		macaco.setPelo(true);
		
		humano.setAltura(1.75);
		humano.setChifre(false);
		humano.setCor("Beje");
		humano.setPeso(80);
		humano.setPelo(false);
		
		penguin.setAltura(0.75);
		penguin.setChifre(false);
		penguin.setCor("Preto e Branco");
		penguin.setPeso(30);
		penguin.setVoa(false);
		penguin.setAlturaVoo(0);
		
		bem_te_vi.setAltura(0.12);
		bem_te_vi.setChifre(false);
		bem_te_vi.setCor("Amarelo");
		bem_te_vi.setPeso(1);
		bem_te_vi.setVoa(true);
		bem_te_vi.setAlturaVoo(40);
		
		System.out.println("\n_______________________________________________________________\n\n\t Peixe boi:");
		peixe_boi.print(peixe_boi);
		System.out.println("\n_______________________________________________________________\n\n\t peixe espada:");
		peixe_espada.print(peixe_espada);
		System.out.println("\n_______________________________________________________________\n\n\t macaco:");
		macaco.print(macaco);
		System.out.println("\n_______________________________________________________________\n\n\t humano:");
		humano.print(humano);
		System.out.println("\n_______________________________________________________________\n\n\t penguin:");
		penguin.print(penguin);
		System.out.println("\n_______________________________________________________________\n\n\t bem te vi:");
		bem_te_vi.print(bem_te_vi);
		
		}
	
}
