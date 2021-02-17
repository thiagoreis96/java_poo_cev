package application;

public class Program3 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Faber Castell", "amarela", 0.5);
		
		c1.setModelo("BIC");
		//c1.modelo = "BIC";
		
		c1.setCor("vermelha");
		//c1.cor = "vermelha";
		
		c1.setPonta(0.5);
		//c1.ponta = 0.5;
		
		System.out.println("Tenho uma caneta " + c1.getModelo() 
							+ " de ponta " + c1.getPonta()
							+ " de cor " + c1.getCor());
	}
}
