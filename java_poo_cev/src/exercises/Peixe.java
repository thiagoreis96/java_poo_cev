package exercises;

public class Peixe extends Animal {
	private String corEscama;
	

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Subst�ncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}
}
