
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1372, 22443);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1441, 22123);
		
		System.out.println(Conta.getTotal());
	}
}
