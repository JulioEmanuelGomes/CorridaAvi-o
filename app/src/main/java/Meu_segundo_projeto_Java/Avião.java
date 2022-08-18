package Meu_segundo_projeto_Java;

public class Avião {
	String cor;
	
	iMotorAvião motor;
	
	public Avião(iMotorAvião m ) {
		this.motor = m;
	}

	public String Acelerar(int intensidade) {
	return this.motor.Acelerar(intensidade);
		
	}

}
