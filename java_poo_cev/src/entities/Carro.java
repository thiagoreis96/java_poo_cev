package entities;

public class Carro {
	
	public String modelo;
	public String cor;
	public double motor;
	public int passageiros;
	public boolean tanque;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Motor: " + this.motor);
		System.out.println("Passageiros: " + this.passageiros);
		System.out.println("Tanque cheio? " + this.tanque);
	}
	
	public void acelerar() {
		if (tanque == false) {
			System.out.println("Encha o tanque para poder dirigir.");
		} else {
			System.out.println("Aproveite a viagem!");
		}
	}
	
	public void encherTanque() {
		this.tanque = true;
	}
	
	public void esvaziarTanque() {
		this.tanque = false;
	}
}
