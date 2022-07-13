
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		//Super é porque estou pegando da class mãe, em vez de usar o this, usar o super nesses casos
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getBonificacao() + super.getSalario();
				
	}

}
