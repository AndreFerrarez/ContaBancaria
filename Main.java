package com.br.domain.banco;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Andre Ferrarez");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(15000);
		cc.transferir(1150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
