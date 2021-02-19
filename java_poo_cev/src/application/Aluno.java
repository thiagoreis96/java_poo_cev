package application;

public class Aluno extends Humano {

	private int matr;
	private String curso;
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}
	public int getMatr() {
		return matr;
	}
	public void setMatricula(int matr) {
		this.matr = matr;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
