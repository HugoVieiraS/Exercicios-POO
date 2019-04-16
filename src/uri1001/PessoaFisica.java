package uri1001;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nome, String sobreNome) {
		super(nome, sobreNome);
	}

	public PessoaFisica(String nome) {
		super(nome);
	}

	public PessoaFisica() {

	}

	private String Cpf;
	private String Endereco;
	
	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

}
	