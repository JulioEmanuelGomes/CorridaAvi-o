package Meu_segundo_projeto_Java;

public class Avi�o {
	String cor;
	
	iMotorAvi�o motor;
	
	public Avi�o(iMotorAvi�o m ) {
		this.motor = m;
	}

	public String Acelerar(int intensidade) {
	return this.motor.Acelerar(intensidade);
		
	}

}
