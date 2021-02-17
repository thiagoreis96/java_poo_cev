/*
 * 1) Criar uma classe com um objeto qualquer.
 * Fazer testes semelhantes aos feitos com a classe Caneta.
 */

package exercises;

import application.Carro;

public class Ex01 {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		
		car1.modelo = "SUV";
		car2.modelo = "Sedan";
		car1.cor = "Azul marinho";
		car2.cor = "Vermelho";
		car1.motor = 4.0;
		car2.motor = 2.0;
		car1.passageiros = 2;
		car2.passageiros = 4;
		car1.encherTanque();
		car2.esvaziarTanque();
		
		car1.status();
		car1.acelerar();
		
		System.out.println();
		
		car2.status();
		car2.acelerar();
	}
}
