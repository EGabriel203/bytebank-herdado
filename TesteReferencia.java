
public class TesteReferencia {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		
		
		Funcionario ev = new EditorVideo();
		ev.setNome("gabril");
		ev.setSalario(2500.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
		
	}

}
