package application;

public class Program8 {

	public static void main(String[] args) {
		
		/*Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo('M');
		System.out.println(v1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Cl�udio");
		a1.setMatricula(1111);
		a1.setCurso("Inform�tica");
		a1.setIdade(16);
		a1.setSexo('M');
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Jubileu");
		b1.setMatricula(1112);
		b1.setBolsa(12.5);
		b1.setSexo('M');
		b1.pagarMensalidade();
	}
}
