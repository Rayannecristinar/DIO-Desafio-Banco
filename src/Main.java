
public class Main {

	public static void main(String[] args) {
		
		Cliente rayanne = new Cliente();
		rayanne.setNome("Rayanne Cristina");
		
		Conta cc = new ContaCorrente(rayanne);
		Conta poup = new ContaPoupanca(rayanne);
		
		cc.depositar(5000);
		cc.transferir(1000,poup);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();

	}

}
