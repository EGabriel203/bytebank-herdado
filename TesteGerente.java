
public class TesteGerente {
		public static void main(String[] args) {
			Gerente g1 = new Gerente();
			g1.setNome("Marco");
			g1.setCpf("17621541709");
			g1.setSalario(5000.0);
			
			System.out.println(g1.getNome());
			System.out.println(g1.getCpf());
			System.out.println(g1.getSalario());
			
			g1.setSenha(2222);
			boolean autenticou = g1.autenticou(2222);
			
			System.out.println(autenticou);
			
			System.out.println(g1.getBonificaco());
			
			
		}
}
