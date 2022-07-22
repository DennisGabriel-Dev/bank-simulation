package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca();
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
