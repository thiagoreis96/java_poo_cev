package application;

public class Program2 {

	public static void main(String[] args) {
		
		Lapiseira l1 = new Lapiseira();
		l1.modelo = "BIC";
		l1.cor = "Azul";
		//c1.ponta = 0.5;
		l1.carga = 80;
		//l1.tampada = true;
		l1.destampar();
		l1.status();
		l1.rabiscar();
		
		

	}
}
