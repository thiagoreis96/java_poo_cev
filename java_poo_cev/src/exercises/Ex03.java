package exercises;

public class Ex03 {

	public static void main(String[] args) {
		
		Mamifero mam = new Mamifero();
		Reptil rep = new Reptil();
		Peixe pei = new Peixe();
		Ave ave = new Ave();
		Canguru can = new Canguru();
		Cachorro cac = new Cachorro();
		Cobra cob = new Cobra();
		Tartaruga tar = new Tartaruga();
		PeixeDourado ped = new PeixeDourado();
		Arara ara = new Arara();
		
		can.locomover();
		cac.locomover();
		can.emitirSom();
		cac.emitirSom();
		

	}
}
