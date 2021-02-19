package exercises;

public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Som de Ave");
	}

	@Override
	public void emitirSom() {
		System.out.println("Construindo Ninho");
	}
	
	public void fazerNinho() {
		System.out.println("Construindo Ninho");
	}
}
