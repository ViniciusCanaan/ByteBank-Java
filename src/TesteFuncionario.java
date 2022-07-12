
public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("121212121-33");
		nico.setSalario(2580.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
	
}
