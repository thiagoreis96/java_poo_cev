package application;

public class Bolsista extends Aluno {
	
	private double bolsa;
	
	public void RenovarBolsa() {
		System.out.println("Renovando a bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
}
