
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticou(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificaco() {
		return super.getBonificaco() + super.getSalario();
	}

}